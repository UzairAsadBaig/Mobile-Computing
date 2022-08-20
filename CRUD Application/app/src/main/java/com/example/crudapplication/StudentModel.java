package com.example.crudapplication;

public class StudentModel {
    private String name;
    private int rollNmber;
    private boolean isEnroll;

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", rollNmber=" + rollNmber +
                ", isEnroll=" + isEnroll +
                '}';
    }

    public StudentModel(String name, int rollNmber, boolean isEnroll) {
        this.name = name;
        this.rollNmber = rollNmber;
        this.isEnroll = isEnroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNmber() {
        return rollNmber;
    }

    public void setRollNmber(int rollNmber) {
        this.rollNmber = rollNmber;
    }

    public boolean isEnroll() {
        return isEnroll;
    }

    public void setEnroll(boolean enroll) {
        isEnroll = enroll;
    }
}