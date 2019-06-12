package com.study.dubbo.Controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.study.dubbo.domain.Contact;
import com.study.dubbo.service.ContactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author:Mr.Zheng
 * @Date:2017.11.6
 */
@RestController
public class ContactController {

    @Reference   //dubbo提供了@Reference注解，可替换@Autowired注解，用于引入远程服务
    private ContactService contactService;


    @GetMapping("/get")
    public List<Contact> get(){
        System.out.println("123");
        List<Contact> all = contactService.findAll();

        return all;
    }










}
