package com.example.backspring.controller;

import com.example.backspring.mapper.CategoryMapper;
import com.example.backspring.pojo.Category;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/7
 */

@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController extends HttpController<CategoryMapper, Category> {
}
