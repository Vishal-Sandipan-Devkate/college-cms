package com.college.cms;

import java.io.Serializable;

public class Announcement implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String title;
    private String category;
    private String description;

    public Announcement() {
    }

    public Announcement(
            int id,
            String title,
            String category,
            String description) {

        this.id = id;
        this.title = title;
        this.category = category;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
