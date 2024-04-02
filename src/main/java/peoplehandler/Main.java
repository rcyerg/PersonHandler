package peoplehandler;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", "Smith");
        Person person2 = new Person("Tim", "Jones");
        Person person3 = new Person("Leon", "White");

        Person[] personArray1 = {person1, person2, person3};

        PersonHandler personHandler = new PersonHandler(personArray1);

//        System.out.println(personHandler.whileLoop());

//        System.out.println(personHandler.forLoop());
//
//        System.out.println(personHandler.forEachLoop());

    }
}
