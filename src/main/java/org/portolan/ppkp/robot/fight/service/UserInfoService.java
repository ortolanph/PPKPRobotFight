package org.portolan.ppkp.robot.fight.service;

import org.portolan.ppkp.robot.fight.entities.UserInfo;
import org.portolan.ppkp.robot.fight.persistence.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository repository;

    public void saveUserInfo(UserInfo userInfo) {
        repository.save(userInfo);
    }

    public boolean validateUserAccess(String ip) {
      // get the IP = OK
      // search for the IP
      // If found
      //    verify if accesses for that IP is > daily.accessCount for this day
      //        TRUE » Return false
      //        FALSE » Add 1 to accessCount save the record
      // Not found
      //    add a new userinfo

      UserInfo userInfo = new UserInfo();

      userInfo.setIp(request.getRemoteAddr());
      userInfo.setCountry("DEFAULT");
      userInfo.setLastAccess(new Date());
      userInfo.setAccessCount(1);
      userInfo.setPath(request.getRequestURL().toString());

      userInfoService.saveUserInfo(userInfo);

      return false;
    }
}
