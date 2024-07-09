package com.example.backspring.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backspring.pojo.Medicine;
import com.example.backspring.pojo.Physician;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/9
 */


@Mapper
public interface PhysicianMapper extends BaseMapper<Physician> {
    @Select("SELECT tb_physician.*,tb_department.dname FROM tb_physician left join tb_department on tb_physician.did=tb_department.id order by tb_department.id asc ")
    List<Physician> selectList(Wrapper<Physician> queryWrapper);
}
