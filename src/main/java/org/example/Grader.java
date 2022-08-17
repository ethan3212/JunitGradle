package org.example;

public class Grader {
    public char getGrade(int gradeNumber) {
        if(gradeNumber < 0) {
           throw new IllegalArgumentException("Grade cannot be negative: ");
        } if(gradeNumber < 60) {
            return 'F';
        } if(gradeNumber < 70) {
            return 'D';
        } if(gradeNumber < 80) {
            return 'C';
        } if(gradeNumber < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
