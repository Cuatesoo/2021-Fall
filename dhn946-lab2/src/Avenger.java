/**
 * Avenger is a Java class containing a main method to represent an Avenger object, at type of
 * defined as having everything located in the CSV file.
 * 
 * @dhn946 
 * UTSA CS 3443 - Lab 2
 * Fall 2021
 */
// class Avenger extending class Person
public class Avenger extends Person {

    // declaring variables as instructed in question
    private String alias,gender,height,heightInch,currentLocation;
    private double weight;
    private  boolean specialAbilities;

    // constructor of Avenger class
    public Avenger(String name,String alias,String gender,String heightFeet,String heightInch, String weight,String specialAbilities,String currentLocation) {
        super(name);
        this.alias = alias;
        this.currentLocation = currentLocation;
        this.gender = gender;
        this.height = heightFeet;
        this.heightInch = heightInch;
        this.weight = Double.parseDouble(weight);
        this.specialAbilities = specialAbilities.equals("N")?false:true;

    }

    // getters
    public String getAlias() {
        return alias;
    }

    public String getGender() {
        return gender;
    }

    public String getHeightFeet() {
        return height;
    }

    public String getHeightInch() {
        return heightInch;
    }    
    
    public String getCurrentLocation() {
        return currentLocation;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isSpecialAbilities() {
        return specialAbilities;
    }

    // setters
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeightFeet(String height) {
        this.height = height;
    }
    
    public void setHeightInch(String heightInch) {
        this.height = heightInch;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpecialAbilities(boolean specialAbilities) {
        this.specialAbilities = specialAbilities;
    }

    // overriding toString method to print object of avenger class
    @Override
    public String toString() {

        // finding special ability.
        String ability = this.isSpecialAbilities()? "Yes":"No";
        return "-" + this.getName()+" (" + this.getAlias() + ")\n"+
                "Special abilities: " +  ability +"\n" +
                this.getGender() + ", " + this.getHeightFeet() +"'" + this.getHeightInch() +"'', " + this.getWeight() + "lbs\n" +
                "Current location: " + this.getCurrentLocation() + "\n";
    }
}