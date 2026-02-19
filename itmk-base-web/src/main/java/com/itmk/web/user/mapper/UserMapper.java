package com.itmk.web.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmk.web.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname UserMapper
 * @Description 员工 Mapper层接口
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
