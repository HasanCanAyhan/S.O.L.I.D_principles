package com.cydeo.dependencyInversion.example.bad;

public class UserReader {

    private XMLReader xmlReader;      // What happens if we decide to use JSON format instead of XML format?
    //private JSONReader jsonReader;
    public UserReader(XMLReader xmlReader) {       // we need to add jsonReader in Constructor too
        this.xmlReader = xmlReader;
    }

    public String getUsername() {                 // public String getUsrNameFromXML()
        return xmlReader.getUsername();
    }

    /*
    public String getUsrNameFromJSON() {         // public String getUsrNameFromXML()
        return jsonReader.getUsername();
    }
     */

}
