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
@TableName("tb_medicine")
public class Medicine {
    @TableId(type = IdType.AUTO)
    private int id;
    private String medicine;
    private  int price;
    private String content;
    private int cid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ctime;
    private String photo;
    @TableField(exist = false)//表示表中没有
    private String category;
}
