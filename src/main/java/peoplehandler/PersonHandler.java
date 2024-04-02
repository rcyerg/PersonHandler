package peoplehandler;

public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into
    // simple lines of code...

    public String whileLoop() {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        // create a `counter`
        int i = 0;
        // while `counter` is less than length of array
        while (i < this.personArray.length) {
        // begin loop
        // use `counter` to identify the `current Person` in the array
            result = result.concat((personArray[i].toString()));
            i++;
        }
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for (int i = 0 ; i < this.personArray.length; i++) {
            // use the above clauses to declare for-loop signature
            // begin loop
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result = result.concat((personArray[i].toString()));
            // end loop
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for (Person person : personArray){
            result = result.concat(person.toString());
        }
        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
