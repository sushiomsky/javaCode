package de.suchomsky.methoden;

/**
 * Created by dennis on 14.03.17.
 */
public class Programmverlauf {
    public static void main(String[] args) {
        methode1();
        methode1();
    }

    public static void methode1() {
        Exception ex = new Exception();
        StackTraceElement stackTop = ex.getStackTrace()[0];
        String methodName = stackTop.getMethodName();
        System.out.println(methodName);
        methode2();
    }

    public static void methode2() {
        Exception ex = new Exception();
        StackTraceElement stackTop = ex.getStackTrace()[0];
        String methodName = stackTop.getMethodName();
        System.out.println(methodName);
        methode3();
    }

    public static void methode3() {
        Exception ex = new Exception();
        StackTraceElement stackTop = ex.getStackTrace()[0];
        String methodName = stackTop.getMethodName();
        System.out.println(methodName);
        methode4();
    }

    public static void methode4() {
        Exception ex = new Exception();
        StackTraceElement stackTop = ex.getStackTrace()[0];
        String methodName = stackTop.getMethodName();
        System.out.println(methodName);
    }
}
