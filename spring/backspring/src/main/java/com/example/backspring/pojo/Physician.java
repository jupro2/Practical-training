package com.example.backspring.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;
import java.util.Date;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/9
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_physician")
public class Physician {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer did;
    private String pname;
    private int pgender;
    private String poccname;
    private Date pbirth;
    private Year pyear;

    @TableField(exist = false)//表示表中没有
    private String dname;

}
