/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainstudentclass;

/**
 *
 * @author User
 */
class AverageFormula {
    public void calculateAndFindMaxAverage(int a, int b, int c,
                                           int x, int y, int z,
                                           int k, int l, int m) {
        // Calculate averages for each student
        double avg1 = (a + b + c) / 3.0;
        double avg2 = (x + y + z) / 3.0;
        double avg3 = (k + l + m) / 3.0;

        System.out.printf("\nAverage marks for Student 1: %.2f " , avg1);
        System.out.printf("\nAverage marks for Student 2: %.2f" , avg2);
        System.out.printf("\nAverage marks for Student 3: %.2f" , avg3);

        // Find the highest average among the students
        double maxAverage = Math.max(Math.max(avg1, avg2), avg3);

        System.out.printf("\nThe highest average mark is: %.2f\n", maxAverage);
    }
}

