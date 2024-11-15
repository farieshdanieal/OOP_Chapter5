/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainstudentclass;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class StudentMarks {
    Scanner baca = new Scanner(System.in);
    
    
    int student1_mark1, student1_mark2, student1_mark3;
    int student2_mark1, student2_mark2, student2_mark3;
    int student3_mark1, student3_mark2, student3_mark3;

    public void layarmesej(){
        // Get marks for each student
        System.out.println("\nEnter Marks for Student 1");
        System.out.print("Enter Mark 1: ");
        student1_mark1 = baca.nextInt();
        System.out.print("Enter Mark 2: ");
        student1_mark2 = baca.nextInt();
        System.out.print("Enter Mark 3: ");
        student1_mark3 = baca.nextInt();

        System.out.println("\nEnter Marks for Student 2");
        System.out.print("Enter Mark 1: ");
        student2_mark1 = baca.nextInt();
        System.out.print("Enter Mark 2: ");
        student2_mark2 = baca.nextInt();
        System.out.print("Enter Mark 3: ");
        student2_mark3 = baca.nextInt();

        System.out.println("\nEnter Marks for Student 3");
        System.out.print("Enter Mark 1: ");
        student3_mark1 = baca.nextInt();
        System.out.print("Enter Mark 2: ");
        student3_mark2 = baca.nextInt();
        System.out.print("Enter Mark 3: ");
        student3_mark3 = baca.nextInt();

        // Calculate average and find highest average
        AverageFormula kira = new AverageFormula();
        kira.calculateAndFindMaxAverage(student1_mark1, student1_mark2, student1_mark3, 
                student2_mark1, student2_mark2, student2_mark3, 
                student3_mark1, student3_mark2, student3_mark3);
    }
}

