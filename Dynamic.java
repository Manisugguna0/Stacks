
import java.util.ListIterator;
import java.util.Stack;

class Person{
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
public class Dynamic{

public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop
  Stack<Person> s = new Stack<>();
        s.push(new Person("Mani", 30));
        s.push(new Person("Sai", 25));
        s.push(new Person("sri", 35));

  ListIterator<Person> l = s.listIterator();
  while (l.hasNext()) {
    // Get the next Person object
    Person person = l.next();
    // Print Person details
    person.display();
}

}
}
