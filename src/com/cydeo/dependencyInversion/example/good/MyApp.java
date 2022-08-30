package com.cydeo.dependencyInversion.example.good;

public class MyApp {

    public static void main(String[] args) {

        XMLReader xmlReader = new XMLReader();

        UserReader userReader = new UserReader(xmlReader);
        userReader.getUsername();

    }

}
