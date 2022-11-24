package com.library.service.impl;

import com.library.dao.ClassInfoDao;
import com.library.pojo.ClassInfo;
import com.library.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classInfoService")
public class ClassInfoServiceImpl implements ClassInfoService {
    @Autowired
    private ClassInfoDao classInfoDao;
    @Override
    public List<ClassInfo> queryClassInfoAll() {
        System.out.println("MyBatis Select :: "+classInfoDao.queryClassInfoAll());
        System.out.println("Search All");
        return null;
    }
}
