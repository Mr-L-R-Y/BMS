package com.library.service;

import com.library.pojo.ClassInfo;

import java.util.List;

public interface ClassInfoService {
    /**
     *  查询所有的图书类型
     * */
    public List<ClassInfo> queryClassInfoAll();
}
