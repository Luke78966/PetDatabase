/**
 * Main.java
 *
 * This file contains the main functionality of the pet
 * database program.
 */

package edu.CSC422.CSP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    DatabaseHandler handler = new DatabaseHandler();
    PetDatabase pdb = handler.load();

        System.out.println("Pet Database Program\n");
        boolean run = true;
        while (run){
            pdb.printMenu();
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1: choice = 1;
                // View all Pets
                        pdb.printHeader();
                        pdb.printRows();
                        pdb.printFooter();
                        break;
                case 2: choice = 2;
                // Add more Pets
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
                // Update an existing Pet
                    pdb.printHeader();
                    pdb.printRows();
                    pdb.printFooter();
                    System.out.println("Enter the ID of the pet to update: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter a new name and age for the pet: ");
                    String entry = input.nextLine();
                    String[] nameAge = entry.split(" ");
                    int age = Integer.parseInt(nameAge[1]);
                    pdb.updatePet(id, nameAge[0], age);
                    break;
                case 4: choice = 4;
                // Remove an existing Pet
                    pdb.printHeader();
                    pdb.printRows();
                    pdb.printFooter();
                    System.out.println("Enter the ID of the pet you wish to remove: ");
                    int petId = input.nextInt();
                    pdb.removePet(petId);
                    break;
                case 5: choice = 5;
                // Search Pets by name
                    System.out.println("Enter a name to search: ");
                    String n = input.nextLine();
                    String name = n.toLowerCase();
                    pdb.searchByName(name);
                    break;
                case 6: choice = 6;
                // Search Pets by age
                    System.out.println("Enter an age to search: ");
                    int a = input.nextInt();
                    pdb.searchByAge(a);
                    break;
                case 7: choice = 7;
                // Exit the program
                    System.out.println("Option 7 Selected");
                    run = false;
                    handler.save(pdb);
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }
}
