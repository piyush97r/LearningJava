package com.company;

import java.util.Arrays;

public class Votes {
    public static void main(String args[])throws ArrayIndexOutOfBoundsException {
        int[] votes = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
        int userWithMostVotes = mostVotes(votes);
        System.out.println("User with the most votes is User: " + userWithMostVotes);
    }
    public static int mostVotes(int[] votes){
        int userWithMostVotes = 0;
        for(int i=0;i<votes.length;i++){
            if(votes[i]>votes[userWithMostVotes]){
                userWithMostVotes=i;
            }
        }
        return userWithMostVotes;


    }
}
