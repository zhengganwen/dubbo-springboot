package com.study.dubbo.service;



import com.study.dubbo.domain.Contact;

import java.util.List;

/**
 * @Description
 * @Author:Mr.Zheng
 * @Date:
 */
public interface ContactService {
    List<Contact> findAll();
}
