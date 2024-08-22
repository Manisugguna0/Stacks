import java.util.Iterator;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
  Stack s = new Stack();
  s.push(1);
  s.push(2);

  Iterator i = s.iterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }
}
}
