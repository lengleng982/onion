package com.onion.core.entity.annotation;

import com.onion.core.entity.enums.FieldType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Field {

    //字段分类
    public FieldType type() default FieldType.COLUMN;

    //数据库字段名称
    public String column() default "";

}
