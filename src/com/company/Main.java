package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int average = 0;
        int grades[] = new int[1000];
        String nameList[] = new String[1000];

        while (true) {
            System.out.print("User please enter student's name (type \"EXIT\" to print list of names and corresponding grades) ");
            String userInputName = scan.nextLine();

                nameList[counter] = userInputName;

            if(userInputName.equalsIgnoreCase("exit"))
            {
                break;
            }


            System.out.print("Please enter grade for student ");
            int userInputGrade = scan1.nextInt();


                grades[counter] = userInputGrade;

                sum = sum + grades[counter];
                counter++;


            average = sum / counter;
        }

        for (int i = 0; i<counter; i++)
        {
            System.out.println(nameList[i] + " : " + grades[i]);
        }

        System.out.println("Average: " + average);

        //add the ability to enter the name and grade
        //keep the two arrays parallel so that grades[0] and names[0] correlate to same person
        //SOP list of names and average of class

    }
}
