package com.jacoli.DO;

import java.util.Date;

/**
 * Created by lichuange on 2017/8/15.
 */
public class ItemDO {
    private long id;
    private Date created_at;
    private Date modified_at;
    private String title;
    private String picUrl;
    private long priceInCent;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getModified_at() {
        return modified_at;
    }

    public void setModified_at(Date modified_at) {
        this.modified_at = modified_at;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public long getPriceInCent() {
        return priceInCent;
    }

    public void setPriceInCent(long priceInCent) {
        this.priceInCent = priceInCent;
    }
}
