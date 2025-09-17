/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nxt.pojo;

/**
 *
 * @author pain2
 */
public class Notes {

    private int id;
    private String title;
    private String content;
    private String date;
    private Tag tagId;

    private Notes(Builder b) {
        this.id = b.id;
        this.title = b.title;
        this.content = b.content;
        this.date = b.date;
        this.tagId = b.tagId;
    }

    public static class Builder {

        private int id;
        private String title;
        private String content;
        private String date;
        private Tag tagId;

        public Builder(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public Builder(String title, String content, Tag t) throws Exception {
            if(title.isEmpty()||content.isEmpty()||t==null)
                throw new Exception("du lieu sai");
            this.title = title;
            this.content = content;
            this.tagId = t;
        }
        public Builder addDate(String d){
            this.date=d;
            return this;
        }
        public Notes build() {
            return new Notes(this);
        }

        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the tagId
     */
    public Tag getTagId() {
        return tagId;
    }

    /**
     * @param tagId the tagId to set
     */
    public void setTagId(Tag tagId) {
        this.tagId = tagId;
    }
}
