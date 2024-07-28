package thiss.distingush;
/*Returning the Current Instance:
Methods can return the current instance of the class using this.
This is useful for implementing the Builder pattern or method chaining.
*/

public class MyClass3 {
    private int value;

    public MyClass3 setValue(int value) {
        this.value = value;
        return this; // Returns the current instance
    }
}
