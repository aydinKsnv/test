package com.example.students.models;

public class Students {
    private String name;
    private String group;
    private int course;
    private double averageGrade;

    public Students(String name, String group, int course, double averageGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
