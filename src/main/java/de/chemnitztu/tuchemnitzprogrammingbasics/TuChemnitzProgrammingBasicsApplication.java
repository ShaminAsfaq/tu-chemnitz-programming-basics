package de.chemnitztu.tuchemnitzprogrammingbasics;

import de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.AssignmentX;
import de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.assignment4.Task1;
import de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.assignment4.Task2;
import de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.assignment6.Node;
import de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.assignment6.Vote;
import de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.assignment6.VoteList;
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
//        Task1 task1 = new Task1();
//        int[][] arr = {
//                {1, 2, 3},
//                {5, 4, 7},
//                {3, 7, 2}
//        };
//
////        arr = new int[][]{
////                {1, 2, 3, 4},
////                {5, 6, 7, 8},
////                {9, 7, 4, 2},
////                {2, 2, 2, 1},
////        };
//
//        arr = new int[][]{
//                {1, 2, 3, 4, 5},
//                {5, 6, 7, 8, 6},
//                {9, 7, 4, 2, 7},
//                {2, 2, 2, 1, 8},
//                {2, 4, 2, 1, 1}
//        };
//
////        arr = new int[][]{
////                {50}
////        };
//
//        System.out.println("-");
//        System.out.println(task1.productDiagonals(arr, arr.length));
//        //  end.
//
//
//        /**
//         * Assignment 4: Part 2
//         */
//        arr = new int[][]{
//                {10, 20, 30, 40, 50},
//                {15, 25, 35, 45, 52},
//                {27, 29, 37, 48, 55},
//                {32, 33, 39, 50, 56},
//                {32, 33, 39, 50, 60}
//        };
//
//        System.out.println("-");
//        Task2 task2 = new Task2();
//        System.out.println(Arrays.toString(task2.search(arr, arr.length, 50)));
//        //  end.

        /** Assignment 6 **/

//        VoteList voteList = new VoteList();
//        System.out.println("Adding Vote.YES");
//        voteList.add(Vote.YES);
//        System.out.println("Adding Vote.NO");
//        voteList.add(Vote.NO);
//        System.out.println("Adding Vote.INVALID");
//        voteList.add(Vote.INVALID);
//        System.out.println("Adding Vote.NO");
//        voteList.add(Vote.NO);
//        System.out.println("Adding Vote.NO");
//        voteList.add(Vote.NO);
//        System.out.println("Adding Vote.YES");
//        voteList.add(Vote.YES);

//        Vote[] array = new Vote[] { Vote.YES, Vote.NO, Vote.NO, Vote.NO, Vote.INVALID, Vote.INVALID, Vote.INVALID, Vote.INVALID, Vote.YES, Vote.YES, Vote.NO, Vote.NO };
//        voteList.importVotes(array);
//        boolean foundValidity = voteList.isValid();
//        System.out.println("Validity: " + foundValidity);
//        Vote vote = voteList.countVotes();
//        System.out.println("Final Count: " + vote);

        VoteList christmasPartyVoting = new VoteList();
        Vote[] friendVotes = {Vote.YES, Vote.YES, Vote.NO, Vote.INVALID, Vote.INVALID, Vote.NO, Vote.YES, Vote.NO};
        Vote[] familyVotes = {Vote.INVALID, Vote.YES, Vote.YES, Vote.NO};
        int importVotesFriends = christmasPartyVoting.importVotes(friendVotes);// returns 8
        boolean validityFriends = christmasPartyVoting.isValid();// returns true
        Vote countFriends = christmasPartyVoting.countVotes();// returns INVALID
        int importVotesFamily = christmasPartyVoting.importVotes(familyVotes);// returns 4
        boolean validityFamily = christmasPartyVoting.isValid();// returns true
        Vote countFamily = christmasPartyVoting.countVotes();// returns YES

        System.out.println(importVotesFriends);
        System.out.println(validityFriends);
        System.out.println(countFriends);
        System.out.println(importVotesFamily);
        System.out.println(validityFamily);
        System.out.println(countFamily);

    }
}

