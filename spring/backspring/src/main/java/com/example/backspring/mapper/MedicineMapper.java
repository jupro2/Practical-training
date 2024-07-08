package com.example.backspring.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backspring.pojo.Medicine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/8
 */

@Mapper
public interface MedicineMapper extends BaseMapper<Medicine> {
    @Override
    @Select("SELECT tb_medicine.*,tb_category.category FROM tb_medicine left join tb_category on tb_medicine.cid=tb_category.id order by id desc ")
    List<Medicine> selectList(Wrapper<Medicine> queryWrapper);
}
