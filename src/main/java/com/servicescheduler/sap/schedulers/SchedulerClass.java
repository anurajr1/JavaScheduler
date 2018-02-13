package com.servicescheduler.sap.schedulers;


import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerClass {
    public static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(SchedulerClass.class);
    public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    @Scheduled(fixedRate = 2000) //Milliseconds
    public void runTask(){
        LOGGER.info("Invoked");
    }

}
