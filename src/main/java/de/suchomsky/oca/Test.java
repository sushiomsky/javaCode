package de.suchomsky.oca;

/**
 * Created by sushi on 28.03.17.
 */
class Test {

    public static void swap(Person p1, Person p2) {
        Person temp = p1;
        p1 = p2;
        p2 = temp;
    }

    public static void resetValueOfMemberVariable(Person p1) {
        p1.setName("Rodrigue");
    }

    public static void main(String args[]) {
        Person person1 = new Person("John");
        System.out.println(person1.getName());//Print person1.name before passing it to resetValueOfMemberVariable
        resetValueOfMemberVariable(person1);//Pass person1 to method resetValueOfMemberVariable
        System.out.println(person1.getName());

        person1 = new Person("John");
        Person person2 = new Person("Paul");

        System.out.println(person1.getName() + ":" + person2.getName());
        swap(person1, person2);
        System.out.println(person1.getName() + ":" + person2.getName());
    }
}