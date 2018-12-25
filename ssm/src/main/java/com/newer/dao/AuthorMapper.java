package com.newer.dao;

import com.newer.domain.Author;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AuthorMapper {
    @Select("select * from author where id =#{auid}")
    Author findById(@Param("auid") int id);
}
