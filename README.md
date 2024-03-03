### Java ArrayList & LinkedList
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
```
#### The ArrayList class has many useful methods. For example,

```java
// Access an Item
cars.get(0);

//Change an Item
cars.set(0, "Opel");

//Remove an Item
cars.remove(0);

//To remove all the elements in the ArrayList, use the clear() method:
cars.clear();

// ArrayList Size
cars.size();

// Loop Through an ArrayList
for (int i = 0; i < cars.size(); i++) {
    System.out.println(cars.get(i));
}

// Sort an ArrayList
import java.util.Collections;  // Import the Collections class
Collections.sort(cars);  // Sort cars
for (String i : cars) {
    System.out.println(i);
}
```