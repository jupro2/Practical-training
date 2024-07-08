package com.example.backspring.controller;

import com.example.backspring.mapper.DepartmentMapper;
import com.example.backspring.pojo.Department;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/8
 */

@CrossOrigin
@RestController
@RequestMapping("/department")
public class DepartmentController extends HttpController<DepartmentMapper, Department>{
}
