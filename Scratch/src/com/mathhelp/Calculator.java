package com.mathhelp;/*
 * This is an "all-static" class, i.e., one that only contains static methods
 */

class Calculator {
    // add, subtract, isEven
    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
    /**
     * Returns a random integer between 1 and 14
     *
     * HINT: see a class called Math ( in package java.lang), lool for a helpful method here.
     * NOTE: these method in the Math class are all "static",  which means you call them as:
     * Math.methodName()
     * set up is return-type methodName(input parameter)
     */

    public static int getRandomInt() {                                                                                  // perhaps we take two arguments, min and max, this will be later.
        int result = 0;                                                                                                 // declare the return value. Note: local variables do not have a default variables
                                                                                                                        // so the must be initialized.

        double rand = Math.random();                                                                                    // This is 0.0000 to 0.99999
        double scaled = (rand * 14) + 1;                                                                                // Value is now 1.00000 to 14.00000

                                                                                                                        // truncate the decimal part, via explicit downcast from double to int
        result = (int) scaled;                                                                                          // explicit downcast indicated with the use of ()
        return result;

    }

    /**
     * Return a random integer between min and max (inclusive)
     * max 0f 20 and min of 5
     */
    public static  int getRandomInt(int min, int max) {
        int result = 0;
        double rand = Math.random();                                                                                    //0.00000 to 0.99999
        double scaled = rand * (max -min + 1);                                                                          // 5.99999 to 20.99999
        result = (int) (scaled + min);
        return result;

    }

    public static double getAverage(int first,int...rest) {                                                              //  at run time, the variable rest will run as an array
        double result = 0.0;

        double sum = first;
        for(int value : rest) {
            sum = sum + value;                                                                                           // sum+= value; another to write the equation
        }
        result = sum / (1 + rest.length);                                                                               // since the first variable is not passed then, the length of array
                                                                                                                        // will change based of the # non-passed variables
        return result;
    }


}
