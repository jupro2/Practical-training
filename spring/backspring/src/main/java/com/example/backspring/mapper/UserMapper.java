package com.example.backspring.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backspring.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/7
 */

@Mapper
public interface UserMapper  extends BaseMapper<User> {
    @Select("select * from tb_user where username=#{username} AND password=#{password}")
    User select(User user);
}
