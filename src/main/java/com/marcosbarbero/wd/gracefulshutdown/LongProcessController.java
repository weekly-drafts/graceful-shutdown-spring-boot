package com.marcosbarbero.wd.gracefulshutdown;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LongProcessController {

    @RequestMapping("/long-process")
    public String pause() throws InterruptedException {
        Thread.sleep(10000);
        return "Process finished";
    }

}
