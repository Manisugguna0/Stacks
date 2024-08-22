import java.util.Enumeration;
import java.util.Stack;

class Person {
  String name;
  int age;

  
  Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  
  void display() {
      System.out.println("Name: " + name + ", Age: " + age);
  }
}
public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop
 Stack<Person> personStack = new Stack<>();

        // Load Person objects into the Stack
        personStack.push(new Person("Mani", 22));
        personStack.push(new Person("sai", 22));
        personStack.push(new Person("srinu", 22));

        // Get Enumeration for the Stack
        Enumeration<Person> enumeration = personStack.elements();

        // Iterate over the Stack using Enumeration and print the values
        while (enumeration.hasMoreElements()) {
            Person person = enumeration.nextElement();
            person.display();
        }
    

  }}
