package com.taylor.mq;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author xiaolu.zhang
 * @desc:
 * @date: 2017/7/4 15:32
 */

@EnableBinding(Sink.class)
@Slf4j
public class SinkReceiver {
    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        log.info("received:{}", payload);
    }
}
