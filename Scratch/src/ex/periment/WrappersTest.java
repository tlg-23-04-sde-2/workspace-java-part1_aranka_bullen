package ex.periment;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "56";
        int age = Integer.parseInt(ageInput);                                                                            // takes the String imput and converts it into an integer.
        Integer ageInterger = Integer.valueOf(ageInput);                                                                 // takes the integer input and converts it into a String.

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput);                                                               // string  to integer conversion using long primatives
        Long populationLong = Long.valueOf(populationInput);                                                             // integer to string

        String salaryInput = "35000.01";
        double salary = Double.parseDouble(salaryInput);                                                                 // Double variant for string to integer
        Double salaryDouble = Double.valueOf(salaryInput);                                                               // and integer to string

        String isCloudyInput = "true";
        boolean isCloudy = Boolean.parseBoolean(isCloudyInput);                                                          // Boolean variant for string to integer
        Boolean isCloudyBoolean = Boolean.valueOf(isCloudyInput);                                                        // and integer to string


    }
}