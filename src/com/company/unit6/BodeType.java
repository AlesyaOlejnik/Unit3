package com.company.unit6;

public enum BodeType {
    SEDAN("седан"),
    HATCHBACK ("хэтчбэк"),
    UNIVERSAL("универсал");

    String name;

    BodeType(String name) {
        this.name = name;
    }
}
