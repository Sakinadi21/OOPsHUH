package Getter;

/*Getters and setters are methods used in object-oriented programming to access and update the private fields of a class. They provide a way to control how these fields are accessed and modified. Here's a detailed explanation:

    Getters
    A getter method, also known as an accessor, is used to retrieve the value of a private field. It typically has a name that starts with get followed by the name of the field, with the first letter capitalized.

    */
    public class MyClass {
        private int value;

        // Getter method for value
        public int getValue() {
            return value;
        }
    }
