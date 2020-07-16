package emptest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Qualifier

public @interface Alias {

	String value();
	
}
