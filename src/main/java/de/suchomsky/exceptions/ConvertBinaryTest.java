package de.suchomsky.exceptions;

public class ConvertBinaryTest
{
  public ConvertBinaryTest()
  {
    System.out.println("10111011 ist " + ConvertBinary.parseBinary("10111011"));
    String s = "10511011";
    System.out.println(s + " ist " + ConvertBinary.parseBinary(s));
  }
  public static void main(String[] args)
  {
    try {
      ConvertBinaryTest ConvertingBinary = new ConvertBinaryTest();
    }catch (RuntimeException rE){
      System.out.println(rE.getMessage());
    }

  }
}
