package org.portolan.ppkp.robot.fight.service;

import org.portolan.ppkp.robot.fight.entities.UserInfo;
import org.portolan.ppkp.robot.fight.persistence.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.tools.java.Environment;

import java.util.Date;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository repository;

    @Autowired
    private Environment environment;

    public void saveUserInfo(UserInfo userInfo) {
        repository.save(userInfo);
    }

    public boolean validateUserAccess(String ip, String path) {
      // get the IP = OK
      // search for the IP
      // If found
      //    verify if accesses for that IP is > daily.accessCount for this day
      //        TRUE » Return false
      //        FALSE » Add 1 to accessCount save the record
      // Not found
      //    add a new userinfo
        int accesses = repository.todayAccesses(ip);
        int maxAccesses = environment.getgetProperty("");

        if(accesses ==) {
            UserInfo userInfo = new UserInfo();

            userInfo.setIp(ip);
            userInfo.setCountry("DEFAULT");
            userInfo.setLastAccess(new Date());
            userInfo.setPath(path);

            return true;
        } else {

        }

        return false;
    }
}
