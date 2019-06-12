package com.study.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.dubbo.domain.Contact;
import com.study.dubbo.mapper.ContactMapper;
import com.study.dubbo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description
 * @Author:Mr.Zheng
 * @Date:
 */
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactMapper contactMapper;

    @Override
    public List<Contact> findAll() {
        return contactMapper.findAll();
    }
}
