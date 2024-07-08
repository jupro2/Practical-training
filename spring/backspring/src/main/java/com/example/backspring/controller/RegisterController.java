package com.example.backspring.controller;

import com.example.backspring.mapper.RegisterMapper;
import com.example.backspring.pojo.Register;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/8
 */

@CrossOrigin
@RestController
@RequestMapping("/register")
public class RegisterController extends HttpController<RegisterMapper, Register>{
}
