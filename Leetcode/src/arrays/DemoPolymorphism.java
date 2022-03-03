package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoPolymorphism {
    private class Person {
        private String description = null;
        {
            description = "I am a person.";
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        @Override
        public String toString() {
            return getDescription();
        }
    }
    private class Student extends Person {
        {
            setDescription("I am a Student!");
        }
    }
    public static void demo() {
        System.out.println("\n\t" + DemoPolymorphism.class.getName() + ".demo()...");
    
        DemoPolymorphism obj = new DemoPolymorphism();
        List<Person> personList = new ArrayList<>(Arrays.asList(
                obj.new Person(),
                obj.new Person(),
                obj.new Person()
                ));
        for (Person person : personList) {
            System.out.println(person);
        }
        System.out.println("\n\t" + DemoPolymorphism.class.getName() + ".demo()... done!");
    }
}

