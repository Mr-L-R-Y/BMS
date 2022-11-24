package com.library.dao;

import com.library.pojo.ClassInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Component("classInfoDao")
public interface ClassInfoDao {
    /**
     *  查询所有的图书类型
     * */
    @Select("select * from class_info")
    List<ClassInfo> queryClassInfoAll();
}
