package de.chemnitztu.tuchemnitzprogrammingbasics;

import de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.AssignmentX;
import de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.assignment4.Task1;
import de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.assignment4.Task2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TuChemnitzProgrammingBasicsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TuChemnitzProgrammingBasicsApplication.class, args);

//        AssignmentX assignmentX = new AssignmentX();
//
//        int[] list = new int[] {12, 11, 10, 9, 8};
//        System.out.println(Arrays.toString(assignmentX.queue(list)));
//        System.out.println(assignmentX.lengthOfLongestSubstring("geeksforgeeks"));

        /**
         * Assignment 4: Part 1
         */
        Task1 task1 = new Task1();
        int[][] arr = {
                {1, 2, 3},
                {5, 4, 7},
                {3, 7, 2}
        };

//        arr = new int[][]{
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 7, 4, 2},
//                {2, 2, 2, 1},
//        };

        arr = new int[][]{
                {1, 2, 3, 4, 5},
                {5, 6, 7, 8, 6},
                {9, 7, 4, 2, 7},
                {2, 2, 2, 1, 8},
                {2, 4, 2, 1, 1}
        };

//        arr = new int[][]{
//                {50}
//        };

        System.out.println("-");
        System.out.println(task1.productDiagonals(arr, arr.length));
        //  end.


        /**
         * Assignment 4: Part 2
         */
        arr = new int[][]{
                {10, 20, 30, 40, 50},
                {15, 25, 35, 45, 52},
                {27, 29, 37, 48, 55},
                {32, 33, 39, 50, 56},
                {32, 33, 39, 50, 60}
        };

        System.out.println("-");
        Task2 task2 = new Task2();
        System.out.println(Arrays.toString(task2.search(arr, arr.length, 50)));
        //  end.
    }
}

