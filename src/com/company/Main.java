package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int grades[] = new int[1000];

        while (true) {
            System.out.println("User please enter grade");
            int userInput = scan.nextInt();

            if (userInput == -1)
            {
                break;
            }
            else {
                grades[counter] = userInput;

                sum = sum + grades[counter];
                counter++;
            }



        }

        System.out.println("Average: " + (sum/counter));

        //add the ability to enter the name and grade
        //keep the two arrays parallel so that grades[0] and names[0] correlate to same person
        //SOP list of names and average of class

    }
}
