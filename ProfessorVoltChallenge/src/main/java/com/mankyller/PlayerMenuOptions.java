package com.mankyller;

import java.util.Scanner;

public class PlayerMenuOptions {

    private static Scanner input = new Scanner(System.in);

    public static String prompt(String[] options) {

        //default value, no option selected yet
        int selectedOption = -1;

        while(true) {

            try {

                //display the options to the user (see method below)
                printOptions(options);

                //get the input and convert it to an integer
                selectedOption = Integer.parseInt(input.nextLine());

                //subtract 1 to get the right index
                selectedOption--;

                //verify the selected option is valid, if so break out of the loop
                if (selectedOption >= 0 && selectedOption < options.length) {
                    break;
                }
            } catch (Exception ex) {
                //nothing for now
            }

            System.out.println("Invalid option >:0 ");
        }

        return options[selectedOption];
    }

    private static void printOptions(String[] options) {

        System.out.println("Please select an option:");
        for(int i = 0;  i < options.length; i++){

            int optionNum = i + 1;
            System.out.println( "(" + optionNum + ") " + options[i] );

        }

    }
}
