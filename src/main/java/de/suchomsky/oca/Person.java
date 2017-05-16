package de.suchomsky.oca;

/**
 * Created by sushi on 28.03.17.
 */
class Person {

    private String name;

    Person(){

    }
   public Person(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setName(String val) {
        name = val;
    }
}

class smallPerson extends Person{
    smallPerson(String newName){

    }
    public String getName(){
        return super.getName();
    }
}