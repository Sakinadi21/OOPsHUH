package thiss.distingush;
/*Distinguishing Instance Variables from Parameters:
When instance variables and method parameters have the same name,
this is used to differentiate the instance variables from the parameters.
*/
public class MyClass {

        private int value;

        public MyClass(int value) {
            this.value = value; // 'this.value' refers to the instance variable, 'value' refers to the parameter
        }
    }

