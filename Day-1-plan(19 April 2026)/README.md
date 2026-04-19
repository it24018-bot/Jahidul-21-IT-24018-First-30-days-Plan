Coding_example 1

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




Coding _Example 2


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
    
}

public class Main{

    static void main(String[] args){
    
        Student s1=new Student();
        
        s1.name="Md Jahidul Islam";
        
        s1.Roll=IT24018;
        
        s1.district="Tangail";
        
        s1.Number="01775087826";
        
        s1.Show();
        
    }
    
}

