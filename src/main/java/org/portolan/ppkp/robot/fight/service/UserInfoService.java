package org.portolan.ppkp.robot.fight.service;

import org.portolan.ppkp.robot.fight.entities.UserInfo;
import org.portolan.ppkp.robot.fight.persistence.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;

import java.util.Date;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository repository;

    @Autowired
    private Environment environment;

    public boolean validateUserAccess(String ip, String path) {
        int accesses = repository.todayAccesses(ip);
        int maxAccesses = Integer.parseInt(environment.getProperty("daily.accessCount"));

        if(accesses < maxAccesses) {
            UserInfo userInfo = new UserInfo();

            userInfo.setIp(ip);
            userInfo.setCountry("DEFAULT");
            userInfo.setLastAccess(new Date());
            userInfo.setPath(path);

            repository.save(userInfo);

            return true;
        } else {
            return false;
        }
    }
}
