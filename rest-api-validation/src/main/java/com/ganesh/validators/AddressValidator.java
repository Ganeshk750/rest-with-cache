package com.ganesh.validators;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AddressValidator implements ConstraintValidator<AddressValidation, String> {

    List<String> addresses = Arrays.asList("Bangalore","ITPL");
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return addresses.contains(value);
    }
}
