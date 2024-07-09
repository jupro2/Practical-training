package com.example.backspring.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/8
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_register")
public class Register {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String name;
    private int uid;
    private int pid; //医生的id
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date age;
    private String phone;
    private int state;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    @TableField(exist = false)//表示表中没有
    private Integer aggg;

    @TableField(exist = false)//将int转化为字符串
    private String statee;
}