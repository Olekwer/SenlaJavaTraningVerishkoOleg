package com.example.oleg;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Documented
@Inherited
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigProperty {
	
	public static final String NULL = "";
	
	String configName() default NULL;
	String propertyName() default NULL;
	Class<?> type() default Object.class;
}
