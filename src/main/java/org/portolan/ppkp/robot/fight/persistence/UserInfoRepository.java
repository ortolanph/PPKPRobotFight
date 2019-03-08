package org.portolan.ppkp.robot.fight.persistence;

import org.portolan.ppkp.robot.fight.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

  @Query("select count(u) from UserInfo u where u.ip = :ip")
  int todayAccesses(String ip);

}
