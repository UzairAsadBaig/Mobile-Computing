package com.example.alhuda;


public class SurahModel {
    String name;
    int id;

    @Override
    public String toString() {
        return id +" "+ name;
    }

    public SurahModel(String name) {
        this.name = name;
    }
    public SurahModel(String name, int id) {
        this.name = name;
        this.id= id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
