package com.example.backspring.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/9
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_department_order")
public class DepartmentOrder {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer uid;
    private Integer did;
    @TableField(fill = FieldFill.INSERT)
    private Date dtime;
}
