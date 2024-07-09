package com.example.backspring.controller;

import com.example.backspring.mapper.CategoryMapper;
import com.example.backspring.mapper.DepartmentMapper;
import com.example.backspring.mapper.PhysicianMapper;
import com.example.backspring.pojo.Category;
import com.example.backspring.pojo.Department;
import com.example.backspring.pojo.Physician;
import com.example.backspring.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/9
 */


@CrossOrigin
@RestController
@RequestMapping("/physician")
public class PhysicianController extends HttpController<PhysicianMapper, Physician> {

    @Autowired
    DepartmentMapper departmentMapper;
    @RequestMapping("/did")
    public Record cid(){
        List<Department> departments = departmentMapper.selectList(null);
        Record r = new Record();
        for (Department department : departments){
            r.add("department",department.getDname(),department.getId());
        }
        return r;

    }
}
