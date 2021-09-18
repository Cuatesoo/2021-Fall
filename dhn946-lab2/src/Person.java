/**
 * Person is a Java class containing a main method to that will represent a
 * Person object, defined as have a name as a string and a method to return
 * the String representation.
 * 
 * @dhn946 
 * UTSA CS 3443 - Lab 2
 * Fall 2021
 */
// creating abstract class
public abstract class Person {  

    private String name;

    // constructor
    Person(String name){  
        this.name = name;
    }

    // setter
    public void setName(String name) { 
        this.name = name;
    }

    // getter
    public  String getName(){ 
        return this.name;
    }

    // toString method that will return name of the person.
    @Override
    public  String toString(){  
        return getName() ;
    }

}