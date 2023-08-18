package com.hengssg.diary;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;


@Mapper
public interface UserMapper {
    ArrayList<User> selectAll();
}

