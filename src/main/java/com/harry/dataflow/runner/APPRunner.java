package com.harry.dataflow.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * @author zhouhong
 * @date 2021/10/29 13:42
 */
@Slf4j
@Component
public class APPRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("====================调度任务执行开始====================");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("====================调度任务执行结束====================");
    }
}
