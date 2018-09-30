package com.onion.core.entity.model;

import java.util.Date;

/**
 * 默认常用抽象Model
 */
public class AbstractModel implements Model {

    private String id;
    private Long version;
    private Date created;
    private String creator;
    private Date modified;
    private String modifier;

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId(String id) {

    }

    @Override
    public String getCreator() {
        return null;
    }

    @Override
    public void setCreator(String creator) {

    }

    @Override
    public Date getCreated() {
        return null;
    }

    @Override
    public void setCreated(Date createTime) {

    }

    @Override
    public String getModifier() {
        return null;
    }

    @Override
    public void setModifier(String modifier) {

    }

    @Override
    public Date getModified() {
        return null;
    }

    @Override
    public void setModified(Date modified) {

    }

    @Override
    public Long getVersion() {
        return null;
    }

    @Override
    public void setVersion(Long version) {

    }

}