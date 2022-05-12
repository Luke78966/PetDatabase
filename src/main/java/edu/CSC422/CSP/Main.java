package edu.CSC422.CSP;

import java.util.Locale;
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
                        pdb.printHeader();
                        pdb.printRows();
                        pdb.printFooter();
                        break;
                case 2: choice = 2;
                    input.nextLine();
                    boolean loop = true;
                    while (loop){
                        System.out.println("Enter the pets name followed by age separated by a space or enter 'done' to stop: ");
                        String entry = input.nextLine();
                        if (entry.equals("done")){
                            loop = false;
                        }else{
                            String[] nameAge = entry.split(" ");
                            int age = Integer.parseInt(nameAge[1]);
                            Pet pet = new Pet(nameAge[0], age);
                            pdb.addPet(pet);
                        }
                    }
                    break;
                case 3: choice = 3;
                    System.out.println("Option 3 Selected");
                    break;
                case 4: choice = 4;
                    System.out.println("Option 4 Selected");
                    break;
                case 5: choice = 5;
                    input.nextLine();
                    System.out.println("Enter a name to search: ");
                    String n = input.nextLine();
                    String name = n.toLowerCase();
                    pdb.searchByName(name);
                    break;
                case 6: choice = 6;
                    input.nextLine();
                    System.out.println("Enter an age to search: ");
                    int a = input.nextInt();
                    pdb.searchByAge(a);
                    break;
                case 7: choice = 7;
                    System.out.println("Option 7 Selected");
                    run = false;
                    System.out.println("Goodbye!");
                    break;

            }


        }


    }
}
