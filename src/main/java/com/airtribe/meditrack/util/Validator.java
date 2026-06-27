package com.airtribe.meditrack.util;


import com.airtribe.meditrack.exception.InvalidDataException;

public class Validator {

    public static void validateName(String name) {
        if(name==null || name.trim().isEmpty()) {
            throw new InvalidDataException(
                    "Name cannot be empty");
        }
    }
    public static void validateAge (int age) {
        if(age<=0 || age> 120) {
            throw new InvalidDataException("Invalid age");
        }
    }
    public static void validateDisease(String disease) {
        if (disease ==null || disease.trim().isEmpty()) {
            throw new InvalidDataException("Disease cannot be Empty" );
        }
    }
    public static void validateFee(double fee) {
        if(fee<0) {
            throw new InvalidDataException("calculation cannot be negative");
        }
    }

}
