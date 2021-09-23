package com.company;

import java.io.IOException;
import java.util.Scanner;

import static com.company.FunctionController.addEmployee;
import static com.company.FunctionController.paying;

public class Main {

    public static void main(String[] args) throws IOException {

        while(true) {
            System.out.println("Welcome Employee Wage Program!");
            System.out.println("Choose 1 ~ 5 you want to do.");
            System.out.println("1. Add Employee.");
            System.out.println("2. Adjust Employee data.");
            System.out.println("3. Delete Employee data.");
            System.out.println("4. Paying. ");
            System.out.println("5. Save data and Exit program");

            Scanner sc = new Scanner(System.in);
            int inputValue = Integer.parseInt(sc.nextLine());

            switch(inputValue) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    System.out.println("[SYSTEM] : Adjust data is not working. buying pro version");
                    break;
                case 3:

                    System.out.println("[SYSTEM] : Delete data is not working. buying pro version");
                    break;
                case 4:
                    System.out.println("Input month of paying : ");
                    Scanner inputs = new Scanner(System.in);
                    paying(Integer.parseInt(inputs.nextLine()));
                    break;
                case 5:
                    break;
                default:
                    System.out.printf("[SYSTEM] : Error ! Input right range of number.\n");
            }



        }

    }
}



