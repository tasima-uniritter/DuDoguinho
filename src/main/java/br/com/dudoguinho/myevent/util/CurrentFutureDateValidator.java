package br.com.dudoguinho.myevent.util;
import java.time.LocalDate;
import java.time.temporal.Temporal;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CurrentFutureDateValidator implements ConstraintValidator<CurrentFutureDate, Temporal> {

	@Override
    public void initialize(CurrentFutureDate constraintAnnotation) {}

    @Override
    public boolean isValid(Temporal value, ConstraintValidatorContext context) {
        if (value == null)
            return true;
        
        LocalDate date = LocalDate.from(value);
        if (date.isAfter(LocalDate.now()))
        	return true;

        return false;
    }

}