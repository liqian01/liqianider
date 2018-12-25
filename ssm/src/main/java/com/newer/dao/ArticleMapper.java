package com.newer.dao;

import com.newer.domain.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleMapper {
    @Insert("insert into article values(null,#{titile},#{content},#{publish_time},1)")
    int addArticle(Article article);

    @Select("select * from article where id = #{Id}")
     Article findbyId(@Param("Id") int Id) ;

    @ResultMap(value ="com.newer.dao.ArticleMapper.article")
    @Select("select  * from article a left join author b  on a.au_id = b.id")
     List<Article>findAll();

}
