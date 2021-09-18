/**
 * Team is a Java class containing a main method to represent a group
 * of Avengers defined as having a team name, String representation
 * of the team and array of the Avenger objects.
 * 
 * @dhn946 
 * UTSA CS 3443 - Lab 2
 * Fall 2021
 */
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class Team {

    private String name;

    // to hold objects of Avenger class
    ArrayList<Avenger> list;

    // constructor
    Team(String name){
        this.name = name;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setList(ArrayList<Avenger> list) {
        this.list = new ArrayList<>();
    }

    // getters
    public String getName() {
        return name;
    }

    public ArrayList<Avenger> getList() {
        return list;
    }

    // method to add avengers to list
    public void addAvenger(Avenger avenger){
        list.add(avenger);
    }
    public  void loadAvengers(String file) throws IOException {

        // concating directory name to file name ( "data-A.csv")
        file = "..\\dhn946-lab2\\data\\" + file;

        // initialising list
        setList(this.list);

        // reader to read csv file.
        BufferedReader reader;

        // variable to store value of a row of a csv file
        String row;
        reader = new BufferedReader(new FileReader(file));

        // reading file until it gives null .
        while((row = reader.readLine()) != null){

            // splitting the row by , to get array of words.
            String [] word = row.split(",");

            // passing values of name,alias,gender,height,weight,specialAbilities and current location to create
            // an object of Avenger class.
            Avenger avenger = new Avenger(word[0],word[1],word[2],word[3],word[4],word[5],word[6],word[7]);

            // adding avenger to the list
            addAvenger(avenger);

        }
        // closing the reader.
        reader.close();

    }

    // overriding the toString method to print value of Team object.
    @Override
    public String toString() {

        // calling toString method of Avenger class.
        String s1 = list.get(0).toString();

        // and storing the returned string in s variables
        String s2 = list.get(1).toString();
        String s3 = list.get(2).toString();
        String s4 = list.get(3).toString();
        String s5 = list.get(4).toString();

        // to print the object of Team class
        return "Team "+ getName() +":\n" + s1 + s2 + s3 + s4 + s5 ;
    }
}