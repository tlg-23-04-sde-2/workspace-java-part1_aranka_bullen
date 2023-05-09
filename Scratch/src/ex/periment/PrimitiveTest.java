package ex.periment;

/**
 *
 */

class PrimitiveTest {
    public static void main(String[] args) {
        int age = 56;
        System.out.println("The value of age: " + age);

        long population = 8_000_000_000L;
        System.out.println("The population is: " + population);

        double weight = 135.5;
        System.out.println("The weight is: " + weight);

        boolean hasTwins = true;
        System.out.println("I have twins: " + hasTwins);

        char shirtsize =  'L';
        System.out.println("The shirt size is: " + shirtsize);

        String name = "Jay";
        System.out.println("The name is " + name);

        // print the following sentence (as a string)
        //The world "belly" makes me laugh
        System.out.println(" The word \"belly\" makes me laugh");

        int i = 18;
        int j = i;
        i++; // adds 1 to the value of i. In this instance, i is now 19.

        System.out.println(" j is: " + j);
        //J will remain 18, because there is no
        // indicator/connection that state J changes value everytime i changes value

        int x = 3;


        System.out.println(" x is: " + ++x);


    }


}