package week_8_homework;

// 25. Example of Constructor Overloading

public class Student25 {
    int id;
    String name;
    int age;
    //creating two arg constructor
    Student25(int i, String n){
        id = i;
        name = n;
    }
    //creating three arg constructor
    Student25(int i, String n, int a){
        id = i;
        name = n;
        age=a;
    }
    public void display(){System.out.println(id+" "+name+" "+age);}
    public static void main(String args[]){
        Student25 s1 = new Student25(111,"Karan");
        Student25 s2 = new Student25(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
