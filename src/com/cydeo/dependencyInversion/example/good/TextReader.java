package com.cydeo.dependencyInversion.example.good;

public class TextReader implements Reader{
    @Override
    public String getUsername() {
        return "mikemith";
    }
}
