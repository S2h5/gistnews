/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;


public class News {
   
    private int id,posted_by;
    private String title,image,description,posted_on,status,status_text;

    public News() {
    }

    public int getId() {
        return id;
    }

    public int getPosted_by() {
        return posted_by;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getPosted_on() {
        return posted_on;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosted_by(int posted_by) {
        this.posted_by = posted_by;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPosted_on(String posted_on) {
        this.posted_on = posted_on;
    }

    public String getStatus() {
        return status;
    }

    public String getStatus_text() {
        return status_text;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatus_text(String status_text) {
        this.status_text = status_text;
    }
   
    
}
