package com.floatpoint.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.floatpoint.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

@Slf4j
@EnableBinding(Source.class)//定义消息的推送管道
public class IMessageProviderImpl implements IMessageProvider {

  @Resource
  private MessageChannel output; // 消息发送管道

  @Override
  public String send() {
    String uuid = IdUtil.randomUUID();
    output.send(MessageBuilder.withPayload(uuid).build());//MessageBuilder 注意导入包为 org.springframework.integration.support.MessageBuilder
    log.info(uuid);
    return uuid;
  }

}
