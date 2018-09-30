package com.onion.core.entity.annotation;

import com.onion.core.entity.enums.EntityType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {

    //实体类型
    public EntityType type() default EntityType.TABLE;

    //数据库表名
    public String table() default "";

}