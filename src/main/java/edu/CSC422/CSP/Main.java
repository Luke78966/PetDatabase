package edu.CSC422.CSP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    PetDatabase pdb = new PetDatabase();

        System.out.println("Pet Database Program\n");
        boolean run = true;
        while (run){

            pdb.printMenu();
            int choice = input.nextInt();
            switch (choice) {
                case 1: choice = 1;
                        System.out.println("Option 1 Selected");
                        pdb.printHeader();
                        pdb.printRows();
                        pdb.printFooter();
                        break;
                case 2: choice = 2;
                    input.nextLine();
                    System.out.println("Option 2 Selected");
                    System.out.println("Enter the pets name followed by age separated by a space: \n");
                    String entry = input.nextLine();
                    String[] nameAge = entry.split(" ");
                    int age = Integer.parseInt(nameAge[1]);
                    Pet pet = new Pet(nameAge[0], age);
                    pdb.addPet(pet);
                    break;
                case 3: choice = 3;
                    System.out.println("Option 3 Selected");
                    break;
                case 4: choice = 4;
                    System.out.println("Option 4 Selected");
                    break;
                case 5: choice = 5;
                    System.out.println("Option 5 Selected");
                    break;
                case 6: choice = 6;
                    System.out.println("Option 6 Selected");
                    break;
                case 7: choice = 7;
                    System.out.println("Option 7 Selected");
                    run = false;
                    break;

            }


        }


    }
}
