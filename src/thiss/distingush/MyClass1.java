package thiss.distingush;

/*Calling Other Constructors:
Within a constructor, you can call another constructor in the same class using this().
This is useful for constructor chaining.
 */
public class MyClass1 {
    private int value;
    private String name;

    public MyClass1(int value) {
        this(value, "defaultName"); // Calls the constructor with two parameters
    }

    public MyClass1(int value, String name) {
        this.value = value;
        this.name = name;
    }
}

