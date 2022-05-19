package edu.CSC422.CSP;

import java.io.*;

public class DatabaseHandler {

    public DatabaseHandler(){

    }

    public PetDatabase createPetDB(){
        PetDatabase pdb = new PetDatabase();
        return pdb;
    }

    public void save(PetDatabase db){
        try{
            FileOutputStream fileOut = new FileOutputStream("petdb.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(db);
            fileOut.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PetDatabase load(){
        try{
            FileInputStream fileIn = new FileInputStream("petdb.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            PetDatabase pdb = (PetDatabase) in.readObject();
            System.out.println("File loaded successfully");
            return pdb;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Load failed. Creating new pet database.");
        return createPetDB();
    }
}
