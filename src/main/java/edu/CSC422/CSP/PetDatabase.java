package edu.CSC422.CSP;

import java.util.ArrayList;

public class PetDatabase {
    public ArrayList<Pet> petDB;

    public PetDatabase(){
        petDB = new ArrayList<Pet>();
    }

    public void addPet(Pet p){
        petDB.add(p);
    }

    public int getSize(){
        return petDB.size();
    }

    public void printHeader(){
        System.out.println("+----------------------+");
        System.out.printf("|%3s | %-10s|%4s |\n","ID","NAME","AGE");
        //System.out.println("|  ID  |  NAME  |  AGE  |");
        System.out.println("+----------------------+");
    }
    public void printRows(){
        for (int i = 0; i < petDB.size(); i++){
            int age = petDB.get(i).getAge();
            String name = petDB.get(i).getName();
            System.out.printf("|%3d | %-10s|%4d |\n",i,name,age);

        }
    }
    public void printFooter(){
        System.out.println("+----------------------+");
        System.out.println(petDB.size() + " rows in set.\n");
    }


    public void printMenu(){
        System.out.println("What would you like to do?");
        System.out.println("1) View all pets");
        System.out.println("2) Add more pets");
        System.out.println("3) Update an existing pet");
        System.out.println("4) Remove an existing pet");
        System.out.println("5) Search pets by name");
        System.out.println("6) Search pets by age");
        System.out.println("7) Exit the program");
        System.out.println("Your choice: ");
    }

}
