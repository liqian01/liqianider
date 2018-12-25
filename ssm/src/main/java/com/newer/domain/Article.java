package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Article implements Serializable {
    private int id;
    private String title;
    private  String content;
    private Date publish_time;
    private  Author author;
    private List<ArticleCommt> articlecommt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitile(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<ArticleCommt> getArticlecommt() {
        return articlecommt;
    }

    public void setArticlecommt(List<ArticleCommt> articlecommt) {
        this.articlecommt = articlecommt;
    }
}
