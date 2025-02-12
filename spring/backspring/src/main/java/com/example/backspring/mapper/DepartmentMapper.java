package com.example.backspring.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backspring.pojo.Department;
import com.example.backspring.pojo.DepartmentOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/8
 */

@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {
}
