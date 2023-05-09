package com.mathhelp;
import static com.mathhelp.Calculator.*;
class CalculatorClient {

     public static void main(String[] args) {
         //com.mathhelp.Calculator calc = new com.mathhelp.Calculator(); // not needed in all static client, class name can use to call upon method

         double sum = Calculator.add(3, 5); // okay to pass int where doubles are expected
         System.out.println("The sum is: " + sum);

         // System.out.println("The difference is: " + calc.sub(3.1,5.1));

         int input = 11;
         System.out.println(input + " is even: " + Calculator.isEven(input));
         System.out.println();

         System.out.println(Calculator.getRandomInt(5,20));

         System.out.println(getAverage(3,4,5,6,5,9));  //Calculator in Calculator.getAverage() was removed because static import for Calculator used.
         System.out.println(Calculator.getAverage(23));

     }
}