package com.panion;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Jay", LocalDate.of(1966, 12, 5));                             // constructor should call setters, however when the class is
        System.out.println(p1);                                                                                         // has a private read-only instances (i.e. no setters) than using
                                                                                                                        // a no-argument constructor will result in null output. Therefore,
        System.out.printf("%s is %s years old.\n", p1.getName(), p1.getAge());                                                                                                              // one needs to remove the no-arg, and call the variable directly using the
//        System.out.println( p1.getName() + "is " + p1.getAge() + " years old.");                                        // this.variable = variable; (direct field assignment) statement under a new constructor with parameters
                                                                                                                        // set to the variable(s) i.e. public Constructor(String variable, int variable2){}
        System.out.println("DONE");                                                                                                                // this will be how the Client-end code will be able to access private Bussiness-end code.


    }
}