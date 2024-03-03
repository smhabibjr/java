### Why do we use static keywords in Java?
In Java, the static keyword is used to define a class-level variable or method that belongs to the class itself rather than to any specific instance of the class. This means that the variable or method is shared across all instances of the class and can be accessed directly through the class name without needing to create an object.

Here's a simple example without a static variable.
```java
// File: Student.java
public class Student {
    int initialStudent = 0;

    Student(){
        initialStudent++;
    }

    int getInitialStudent(){
        return initialStudent;
    }
}

```
See the output? The initialStudent value did not change. Because the initialStudent value is not static, that is why every time it's created a new value for it.

```java
package org.example;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s1.getInitialStudent());
    }
}

// output 
1 // But it would be 3 because we initialize the Student object 3 times.
```
Now change the variable type instance to static and run the program again, you will see the output 3
```java
// File: Student.java
public class Student {
    static int initialStudent = 0;

    Student(){
        initialStudent++;
    }

    int getInitialStudent(){
        return initialStudent;
    }
}

// output 
3
```
In this example, you can see how the static keyword allows variables and methods to be shared across all instances of a class and accessed directly through the class name. This promotes code reusability and improves performance in certain scenarios where you don't need instance-specific behavior.