# Jahidul-21-IT-24018-First-30-days-Plan

Date:19-04-2026

Day-1

Task Name-creating Class and object

Vedio link- https://youtu.be/lWFzm8qIR1c?si=H5U8v8RDIWxkBxzG
Example 1

public class Car {

    String color;
    String model;
    int year;
    void displayInfo(){
        System.out.println("Car's Color : "+color);
        System.out.println("Car's Model : "+model);
        System.out.println("Car's Year  : "+year);
    }
}
public class Main{

    public static void main(String[] args){
  Car myCar=new Car();
  
  myCar.color="Black";
  
  myCar.model="Toyota";
  
  myCar.year=2025;
  
  myCar.displayInfo();
    }
}

Example 2

public class Student{

    String name;
    int Roll;
    String district;
    String Number;
    void Show() {
        System.out.println(name);
        System.out.println(Roll);
        System.out.println(district);
        System.out.println(Number);
    }
    public class main{
    static void main(String[] args){
        Student s1=new Student();
        s1.name="Md Jahidul Islam";
        s1.Roll=IT24018;
        s1.district="Tangail";
        s1.Number="01775087826";
        s1.Show();
       
    }
}





Date-20-04-2026

Day-2

Topic Name-Using Encapsulation

Vedio Link-https://www.youtube.com/watch?v=HZUUYnIZO%5C\_0%5C\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj%5C\&index=4
Example 1
class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Rahim");
        emp.setSalary(50000);

        System.out.println(emp.getName() + " earns " + emp.getSalary());
    }
}
Example2
class Student {
    private String studentId;
    private char grade;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            this.grade = grade;
        } else {
            System.out.println("Invalid Grade");
        }
    }
}

public class SchoolSystem {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId("ICT-101");
        s1.setGrade('A');

        System.out.println("Student: " + s1.getStudentId());
        System.out.println("Grade: " + s1.getGrade());
    }
}








Date-21-04-2026

Day-3

Topic Name-Java Constructors

Video Link : https://www.youtube.com/watch?v=acfR5vRTZvc%5C\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj%5C\&index=5

Example1
class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 20);

        s1.display();
        s2.display();
    }
}
Exaple 2
`
class Car {
    String brand;
    String color;
    int year;

    Car() {
        this("Toyota", "White", 2020);
    }

    Car(String brand) {
        this(brand, "Black", 2022);
    }

    Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year  = year;
    }

    void display() {
        System.out.println(brand + " | " + color + " | " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Honda");
        Car c3 = new Car("BMW", "Red", 2023);

        c1.display();
        c2.display();
        c3.display();
    }
}



Day #04

Date : 22 - 04 - 2026

Topic : Inheritance In Java

Video Link : https://www.youtube.com/watch?v=j\\\_VA2Rp6jM0\\\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\\\&index=6

Example1
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    public static void main(String[] args) {
        Dog d = new Dog("Bruno");
        d.eat();
        d.bark();
    }
}
Example 2
lass Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    String company;

    Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    void showCompany() {
        System.out.println("Company: " + company);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, String company, String department) {
        super(name, company);
        this.department = department;
    }

    void showDepartment() {
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager("Alice", "Google", "Engineering");
        m.display();
        m.showCompany();
        m.showDepartment();
    }
}
`




Day-5

Date : 23 - 04 - 2026

Topic : Polymorphism

Video Link : https://www.youtube.com/watch?v=bLke13zY4rg\\\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\\\&index=7
Example 1

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {
        Animal a = new Dog();         a.sound();             
}

Example 2
class Vehicle {

    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {

    void move() {
        System.out.println("Car drives");
    }
}

public class Main {

    public static void main(String[] args) {
        Vehicle v = new Car();  // parent reference, child object
        v.move();               // calls Car's method
    }
}



Day-6

Date : 24 - 04 - 2026

Topic : Abstraction

Video Link : https://www.youtube.com/watch?v=1SXyi3DK-88\\\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\\\&index=8

Example 1
abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}


class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {

    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
        a.sleep();
    }
}

Example 2
interface Shape {

    void draw();
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {

    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}




Day #07

Date : 25 - 04 - 2026

Topic : Inner Classes In Java

Video Link : https://www.youtube.com/watch?v=lsJ9QjJPbx8\\\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\\\&index=9

Example1
class Outer {
    int x = 10;

    class Inner {
        void show() {
            System.out.println(x);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }

    Example2
    class Outer {
    static int x = 20;

    static class Inner {
        void show() {
            System.out.println(x);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        i.show();
    }
}





Day #08

Date : 26 - 04 - 2026

Topic : Java Collection Framework

Video Link : https://www.youtube.com/watch?v=TDHaeHAlPFg\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\&index=10

Example 1
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits: " + fruits);

        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);
    }
}

Example 2
import java.util.HashMap;

public class Example2 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Cow");
        map.put(2, "Cat");
        map.put(3, "DOg");

        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}






Day #09

Date : 27 - 04 - 2026

Topic : Lists : ArrayList & Linked List

Video Link : https://www.youtube.com/watch?v=q-5D9Z9BCVI\\\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\\\&index=11
Example 1
import java.util.ArrayList;

public class Example1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(1);

        for (int num : list) {
            System.out.println(num);
        }
    }
}

example2
import java.util.LinkedList;

public class Example2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.addFirst("Start");
        list.addLast("End");

        for (String item : list) {
            System.out.println(item);
        }
    }
}






Day :10

Date : 28 - 04 - 2026

Topic : Sets : Hash set & Tree set

Video Link : https://www.youtube.com/watch?v=XDw-BkAZYmY\\\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\\\&index=12
Example 1
import java.util.HashSet;

public class Example1 {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(5);
        set.add(20);

        for (int num : set) {
            System.out.println(num);
        }
    }
}
Example 2
mport java.util.TreeSet;

public class Example2 {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Apple");

        for (String item : set) {
            System.out.println(item);
        }
    }
}


Day :11

Date : 29 - 04 - 2026

Topic : Sets : Queues in Java

Video Link : https://www.youtube.com/watch?v=PccU1wAdnlM\\\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\\\&index=13
Example 1
import java.util.Queue;
import java.util.LinkedList;

public class Example1 {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        q.poll();

        for (int num : q) {
            System.out.println(num);
        }
    }
}

Example 2
import java.util.Queue;
import java.util.PriorityQueue;

public class Example2 {

    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("Banana");
        q.add("Apple");
        q.add("Mango");

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}




Day :12

Date : 30 - 04 - 2026

Topic : Maps : HashMap & TreeMap

Video Link : https://www.youtube.com/watch?v=ZarOdaT7P2k\\\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\\\&index=14

Exaple 1
import java.util.TreeMap;

public class Example2 {

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Banana", 2);
        map.put("Apple", 1);
        map.put("Mango", 3);

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}

Example 2
import java.util.HashMap;

public class Example1 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        map.remove(2);

        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}





