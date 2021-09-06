package com.company;

public class Word{
    private String value;
    private String changeValue;

    public Word(String value) {
        this.value = value;
    }

    public Word() {
    }

    public Word(String value, String changeValue) {
        this.value = value;
        this.changeValue = changeValue;
    }

    public String getValue() {
        return value;
    }
    public String getChangeValue() {
        return changeValue;
    }
}
