package com.jiuxin.activemq.producer;

import com.jiuxin.activemq.BootMqProducerApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes = BootMqProducerApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
class BootMqProducerApplicationTests {

    @Resource
    private Queue_Produce queue_produce;

    @Test
    void testSend() {
        queue_produce.produceMsg();
    }

}
