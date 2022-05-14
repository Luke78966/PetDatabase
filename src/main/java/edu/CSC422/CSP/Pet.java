/**
 * Pet.java
 *
 * Definition of the Pet class
 */
package edu.CSC422.CSP;

public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
