/**
 * PetDatabase.java
 *
 * This file defines the PetDatabase class
 */


package edu.CSC422.CSP;

import java.io.Serializable;
import java.util.ArrayList;

public class PetDatabase implements Serializable {
    public ArrayList<Pet> petDB;

    public PetDatabase(){
        petDB = new ArrayList<Pet>();
    }

    public void addPet(Pet p){
        petDB.add(p);
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

    public void searchByName(String s){
        printHeader();
        int size = 0;
        for (int i = 0; i < petDB.size(); i++){
            if (petDB.get(i).getName().toLowerCase().equals(s)){
                System.out.printf("|%3d | %-10s|%4d |\n", i, petDB.get(i).getName(), petDB.get(i).getAge());
                size++;
            }
        }
        System.out.println("+----------------------+");
        System.out.println(size + " rows in set.");
    }

    public void searchByAge(int age){
        printHeader();
        int size = 0;
        for (int i = 0; i < petDB.size(); i++){
            if (petDB.get(i).getAge() == age){
                System.out.printf("|%3d | %-10s|%4d |\n", i, petDB.get(i).getName(), petDB.get(i).getAge());
                size++;
            }
        }
        System.out.println("+----------------------+");
        System.out.println(size + " rows in set.");
    }

    public void updatePet(int id, String name, int age){
        System.out.println(petDB.get(id).getName() + " " + petDB.get(id).getAge() + " has been changed to "
                            + name + " " + age);
        petDB.get(id).setName(name);
        petDB.get(id).setAge(age);
    }
    public void removePet(int id){
        System.out.println(petDB.get(id).getName() + " " + petDB.get(id).getAge() + " removed.");
        petDB.remove(id);
    }

    public void save(){

    }
//    public PetDatabase load(){
//
//    }
}
