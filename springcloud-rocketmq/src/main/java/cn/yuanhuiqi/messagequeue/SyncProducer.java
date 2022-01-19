package cn.yuanhuiqi.messagequeue;


import org.apache.rocketmq.spring.autoconfigure.RocketMQProperties;
import org.springframework.stereotype.Component;

/**
 * @author 袁慧琪
 * 2021.12.06
 */
@Component
public class SyncProducer {

    private RocketMQProperties.Producer producer;


    public void sendMessage() {

    }
}
