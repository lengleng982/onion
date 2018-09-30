package com.onion.core.entity;

public interface Id<K extends java.io.Serializable> {

    public K getId();

    public void setId(K id);

}