package thiss.distingush;

/*Accessing Instance Methods and Variables:
While this is not strictly necessary for accessing instance methods and variables,
 it can be used to improve code clarity,
 especially when there are naming conflicts.
 */
public class MyClass2 {
    private int value;

    public void setValue(int value) {
        this.value = value; // Clearly indicates the instance variable is being set
    }

    public void printValue() {
        System.out.println(this.value); // Accesses the instance variable
    }
}
