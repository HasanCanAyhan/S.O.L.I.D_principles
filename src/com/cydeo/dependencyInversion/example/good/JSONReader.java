package com.cydeo.dependencyInversion.example.good;

public class JSONReader implements Reader{

    /*
    Example JSON:

    {
        "username" : "mikesmith"
    }

     */

    @Override
    public String getUsername() {
        return "{  \"username\" : \"mikesmith\"    }";
    }
}
