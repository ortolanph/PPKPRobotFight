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
}
