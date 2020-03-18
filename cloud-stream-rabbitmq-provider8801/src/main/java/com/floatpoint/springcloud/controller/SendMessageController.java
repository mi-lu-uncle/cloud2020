package com.floatpoint.springcloud.controller;

import com.floatpoint.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController
{
  @Resource
  private IMessageProvider messageProvider;

  @GetMapping(value = "/msg")
  public String sendMessage()
  {
    return messageProvider.send();
  }

}