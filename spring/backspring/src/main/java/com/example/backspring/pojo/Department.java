package com.example.backspring.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/8
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_department")
public class Department {
    @TableId(type = IdType.AUTO)
    private int id;
    private String dname;
    private int dperson;
    private String dphone;
    private String office;
}
