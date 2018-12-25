package com.newer.domain;

import java.sql.Date;

public class ArticleCommt {
    private  int id;
    private  Author author;
    private  Article article;
    private  String commt;
    private Date commt_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getCommt() {
        return commt;
    }

    public void setCommt(String commt) {
        this.commt = commt;
    }

    public Date getCommt_time() {
        return commt_time;
    }

    public void setCommt_time(Date commt_time) {
        this.commt_time = commt_time;
    }
}
