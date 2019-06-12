package com.study.dubbo.mapper;

import com.study.dubbo.domain.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @author:Mr.Zheng
 * @Date:
 */
@Repository
public interface ContactMapper {
    /**
     * 查询所有的
     * @return List<Contact>
     */
    List<Contact> findAll();

}
