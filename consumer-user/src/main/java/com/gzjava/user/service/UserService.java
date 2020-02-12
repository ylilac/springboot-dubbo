package com.gzjava.user.service;

import com.gzjava.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-dubbo
 * @description: abc
 * @packagename: com.gzjava.user.service
 * @author: yangyu
 * @date: 2020-02-12 23:48
 **/
@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票:"+ticket);
    }
}
