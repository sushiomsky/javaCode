package de.suchomsky.oca;

/**
 Classes and interfaces defined in the same Java source code file
 can’t be defined in separate packages. Classes and interfaces imported using
 the import statement are available to all the classes and interfaces defined in
 the same Java source code file.

 Java defines a default constructor if and only if you don’t define
 a constructor. If a class doesn’t define a constructor, the compiler will add a
 default, no-argument constructor to the class. But if you modify the class later
 by adding a constructor to it, the Java compiler will remove the default, no-
 argument constructor that it initially added to the class.

 The terms encapsulation and information hiding are used inter-
 changeably. By exposing object functionality only through methods, you can
 prevent your private variables from being assigned any values that don’t fit
 your requirements. One of the best ways to create a well-encapsulated class is
 to define its instance variables as private variables and allow access to these
 variables using public methods.

 When you pass a primitive variable to a method, its value remains
 the same after the execution of the method. The value doesn’t change,
 regardless of whether the method reassigns the primitive to another variable
 or modifies it.

 */
public class ExamTips {

    public static void main2(String[] args){}
    static public void main3(String[] args){}
    //The placement of the keywords public and static is interchangeable

    public ExamTips() {

    }
}
