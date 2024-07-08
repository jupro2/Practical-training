package com.example.backspring.controller;

import com.example.backspring.mapper.CategoryMapper;
import com.example.backspring.mapper.MedicineMapper;
import com.example.backspring.pojo.Category;
import com.example.backspring.pojo.Medicine;
import com.example.backspring.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/8
 */

@CrossOrigin
@RestController
@RequestMapping("/medicine")
public class MedicineController extends HttpController<MedicineMapper, Medicine>{
    @Autowired
    CategoryMapper categoryMapper;
    @RequestMapping("/cid")
    public Record cid(){
        List<Category> categories = categoryMapper.selectList(null);
        Record r = new Record();
        for (Category category : categories){
            r.add("category",category.getCategory(),category.getId());
        }
        return r;

    }
}
