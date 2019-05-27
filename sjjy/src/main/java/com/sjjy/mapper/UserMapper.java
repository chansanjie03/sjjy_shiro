package com.sjjy.mapper;

import com.sjjy.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User findUserById(@Param("id") String id);

}