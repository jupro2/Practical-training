package com.example.backspring.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/7
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_category")
public class Category {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String category;
}
