package org.portolan.ppkp.robot.fight.interceptors;

import org.portolan.ppkp.robot.fight.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@Component
public class PPKPUserInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOGGER = Logger.getLogger(PPKPUserInterceptor.class.getName());

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private Environment environment;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean userValidated = userInfoService.validateUserAccess(request.getRemoteAddr(), request.getRequestURL().toString());

        if (!userValidated) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }

        return super.preHandle(request, response, handler);
    }
}
