package Getter;


/*Example Usage
    Here's a complete example demonstrating how getters and setters are used:

    */
    public class Getter {
        private String name;
        private int age;

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        // Setter for age
        public void setAge(int age) {
            if (age > 0) { // Additional logic to validate age
                this.age = age;
            }
        }

        public static void main(String[] args) {
            Getter person = new Getter();
            person.setName("Alice");
            person.setAge(25);

            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    }
    /*Benefits of Getters and Setters
    Encapsulation: They help in encapsulating the data by keeping the fields private and providing public methods to access and modify them.
    Control: You can add logic within the getters and setters to control how the fields are accessed or updated. For example, you can validate the input in a setter.
            Flexibility: They provide flexibility to change the internal implementation without affecting the external code that uses the class.
    Read-Only and Write-Only Properties: By providing only a getter or a setter, you can make a field read-only or write-only.
    Using getters and setters is a fundamental practice in object-oriented programming to ensure proper data management and encapsulation.
*/





