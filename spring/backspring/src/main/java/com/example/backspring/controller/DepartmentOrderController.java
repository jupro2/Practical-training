package com.example.backspring.controller;

import com.example.backspring.mapper.DepartmentOrderMapper;
import com.example.backspring.pojo.DepartmentOrder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/9
 */


@CrossOrigin
@RestController
@RequestMapping("/departmentOrder")
public class DepartmentOrderController extends HttpController<DepartmentOrderMapper, DepartmentOrder>{

}
