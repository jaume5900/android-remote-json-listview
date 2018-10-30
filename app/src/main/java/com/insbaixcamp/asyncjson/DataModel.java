package com.insbaixcamp.asyncjson;


public class DataModel {

    String name;
    String type;
    String version_number;

    public DataModel(String name, String type, String version_number) {
        this.name=name;
        this.type=type;
        this.version_number=version_number;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getVersion_number() {
        return version_number;
    }


}
