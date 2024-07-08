package com.example.backspring.controller;

import com.example.backspring.mapper.MedcineOrderMapper;
import com.example.backspring.mapper.MedicineMapper;
import com.example.backspring.pojo.Medicine;
import com.example.backspring.pojo.MedicineOrder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/8
 */

@CrossOrigin
@RestController
@RequestMapping("/medicineorder")
public class MedicineOrderController extends HttpController<MedcineOrderMapper, MedicineOrder> {
}
