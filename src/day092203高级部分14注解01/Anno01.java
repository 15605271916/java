package day092203高级部分14注解01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER,ElementType.LOCAL_VARIABLE,ElementType.PACKAGE})
@Retention(RetentionPolicy.SOURCE)
public @interface Anno01 {

	int value();
	String a();
	long b()  default 18;
	
}
