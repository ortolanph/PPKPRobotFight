package org.portolan.ppkp.robot.fight.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScheduledAdminTasks {

    @Scheduled(cron = "0 */5 * * * *")
    public void report() {
        System.out.println("================================================================");
        System.out.println("TASKTASKTASKTASKTASKTASKTASKTASKTASKTASKTASKTASKTASKTASKTASKTASK");
        System.out.println(LocalDateTime.now().toString());
        System.out.println("================================================================");
    }

}
