package com.ganesh.validators;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.ganesh.model.Address;

public class AddressObjectValidator implements ConstraintValidator<AddressObjectValidation, List<Address>> {

    List<String> addresses = Arrays.asList("Bangalore","ITPL");
    @Override
    public boolean isValid(List<Address> addresses, ConstraintValidatorContext context) {
        return addresses.size() > 2;
    }
}
