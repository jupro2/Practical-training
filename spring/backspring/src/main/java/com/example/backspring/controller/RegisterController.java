package com.example.backspring.controller;

import com.example.backspring.mapper.RegisterMapper;
import com.example.backspring.pojo.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/8
 */

@CrossOrigin
@RestController
@RequestMapping("/register")
public class RegisterController extends HttpController<RegisterMapper, Register>{
    @Autowired
    private RegisterMapper registerMapper;

    @GetMapping("/list")
    public List<Register> list() {
        List<Register> registers = registerMapper.selectList(null);
        for (Register register : registers) {
            if (register.getAge() != null) {
                register.setAggg(calculateAge(register.getAge()));
                register.setStatee(getSt(register.getState()));
            } else {
                System.out.println("ERROR");
            }
        }
        return registers;
    }
    private String getSt(Integer a){
        if(a==0) {
            return "未就诊";
        }else if(a==1){
            return "已就诊";
        }else {
            return "退号";
        }
    }

    private int calculateAge(Date birthDate) {
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        if (today.get(Calendar.MONTH) < birth.get(Calendar.MONTH) ||
                (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) < birth.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        return age;
    }



}