package org.example.app.utils;

public class NameValidator {
    public static boolean isNameValidator(String name){
        return name.isEmpty()|| !name.matches(Constants.NAME_RGX);
    }
}
