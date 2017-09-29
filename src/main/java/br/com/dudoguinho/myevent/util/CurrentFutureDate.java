package br.com.dudoguinho.myevent.util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CurrentFutureDateValidator.class)
@Documented
public @interface CurrentFutureDate {

	String message() default "Informe uma data superior ou igual a data de hoje";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}