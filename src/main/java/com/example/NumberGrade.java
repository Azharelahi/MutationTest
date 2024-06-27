package com.example;

public class NumberGrade {
    public static char convertGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Invalid grade. Grade must be between 0 and 100.");}
        char letterGrade;
        if (grade >= 90) {
            letterGrade = 'A'; }
        else if (grade >= 80) {
            letterGrade = 'B';}
        else if (grade >= 70) {
            letterGrade = 'C'; }
        else if (grade >= 60) {
            letterGrade = 'D';}
        else {
            letterGrade = 'F';}
        return letterGrade;}
    public static void main(String[] args) {
        int studentGrade = 88;
        char letterGrade = convertGrade(studentGrade);
        System.out.println("The student's grade of " + studentGrade + " corresponds to a letter grade of " +
                letterGrade); }}

