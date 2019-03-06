package org.portolan.ppkp.robot.fight.interceptors;

import org.portolan.ppkp.robot.fight.entities.UserInfo;
import org.portolan.ppkp.robot.fight.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.core.env.Environment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
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
        UserInfo userInfo = new UserInfo();

        userInfo.setIp(request.getRemoteAddr());
        userInfo.setCountry("DEFAULT");
        userInfo.setLastAccess(new Date());
        userInfo.setAccessCount(1);
        userInfo.setPath(request.getRequestURL().toString());

        userInfoService.saveUserInfo(userInfo);

        LOGGER.info(String.format("preHandle: %s", userInfo.toString()));

        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }
}
