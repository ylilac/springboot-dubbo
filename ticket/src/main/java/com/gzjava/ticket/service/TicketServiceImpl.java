package com.gzjava.ticket.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @program: springboot-dubbo
 * @description: 接口实现
 * @packagename: com.gzjava.ticket.service
 * @author: yangyu
 * @date: 2020-02-12 22:26
 **/
@Service
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《厉害了，我的国》";
    }
}
