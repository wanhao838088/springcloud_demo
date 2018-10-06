package com.wanhao.cloud.dao;

import com.wanhao.cloud.bean.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by LiuLiHao on 2018/10/4 11:30.
 * 描述：
 * 作者： LiuLiHao
 */
@Mapper
public interface DeptMapper {
    @Insert("INSERT INTO dept(dname,db_source) VALUES(#{dname},DATABASE())")
    public boolean addDept(@Param("dept") Dept dept);

    @Select("select deptno,dname,db_source from dept where deptno=#{deptno}")
    public Dept findById(@Param("deptno") Long deptno);

    @Select("select deptno,dname,db_source from dept")
    public List<Dept> findAll();
}
