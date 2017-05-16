package de.suchomsky.exceptions;

public class BinaryStringToNumberTest
{
  public BinaryStringToNumberTest()
  {
    try {
      System.out.println("10111011 ist " + BinaryStringToNumber.parseBinary("10111011"));
      String s = "10511011";
      System.out.println(s + " ist " + BinaryStringToNumber.parseBinary(s));
    }catch (NoBinaryNumberException e){
      throw e;
    }

  }
  public static void main(String[] args)
  {
    try {
      BinaryStringToNumberTest ConvertingBinary = new BinaryStringToNumberTest();
    }catch (RuntimeException e){
      System.out.println(e.getMessage());
    }
    finally {
      System.out.println("Programm beendet...");
    }
  }
}
