package com.panion;
/*
 * An immutable class. (i.e. pass in data up front, there they should be fixed/final)
 * More accurately. it's a class definition written in such a way that instamces of
 * (Person object), once created can't have their properties changed.
 *
 * In the code, this simply means no public setters.
 */

import java.time.LocalDate;
import java.time.Period;

class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }

                                                    // only getters for accessor methods. to create the read-only properties of an immutable class
    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getAge() {
        return Period.between(getBirthdate(),LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Person: Name = " + getName() + '\'' + ", Birthdate = " + getBirthdate();
    }
}