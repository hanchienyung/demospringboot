package me.cy.demospringboot;

import java.util.Scanner;

public class GradesReport {

    String student_number;
    String student_name;
    String test_score;
    String letterGrade;
    double percentage_score;
    String displayString;

    public String ShowGrades() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Student Number, Student Name, Test Score");


        student_number = keyboard.next();
        student_name = keyboard.next();
        test_score = keyboard.next();

        -- Calculate percentage_score
        percentage_score =( test_score/ 50)*100;

        if percentage_score >= 90  and percentage_score <= 100
            letterGrade = ‘A’
        elsif percentage_score >= 80  and percentage_score <= 89
           letterGrade = ‘B’
        elsif percentage_score >= 70  and percentage_score <= 79
           letterGrade = ‘C’
        elsif percentage_score >= 60  and percentage_score <= 69
            letterGrade = ‘D’
        elsif percentage_score >= 0  and percentage_score <= 59
           letterGrade = ‘F’
        end if

        System.out.println("Enter Student Number, Student Name, Test Score");
        System.out.println(student_number  + "  " +  Student Name, Test Score"); 

    }

}
