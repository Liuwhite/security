package com.white.security.security;

import com.white.utils.R;
import com.white.utils.ResponseUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 退出处理器
 */
public class TokenLogoutHandler implements LogoutHandler {

    private TokenManager tokenManager;
    private RedisTemplate redisTemplate;

    public TokenLogoutHandler(TokenManager tokenManager, RedisTemplate redisTemplate) {
        this.tokenManager = tokenManager;
        this.redisTemplate = redisTemplate;
    }


    /**
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param authentication
     */
    @Override
    public void logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) {
        //1.从handler获取token

        //2.token不为空，移除token，从Redis中删除token
        String token = httpServletRequest.getHeader("token");
        if (token != null) {
            tokenManager.removeToken(token);
            String username = tokenManager.getUserInfoFromToken(token);
            redisTemplate.delete(username);
            ResponseUtil.out(httpServletResponse, R.ok());
        }
    }
}
