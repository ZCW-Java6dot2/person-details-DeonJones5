package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        while (counter < personArray.length) {
            result.append(personArray[counter]);
            counter++;
        }
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result.toString();
    }

// identify initial value
    // identify terminal condition
    // identify increment

    // use the above clauses to declare for-loop signature
    // begin loop
    // use `counter` to identify the `current Person` in the array
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable
    // end loop

    public String forLoop() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= personArray.length-1; i++) {
            result.append(personArray[i]);
            
        }

        return result.toString();
    }

// identify array's type
    // identify array's variable-name

    // use the above discoveries to declare for-each-loop signature
    // begin loop
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable
    // end loop

    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        for (Person person : personArray) {
            result.append(person.toString());

        }


        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
