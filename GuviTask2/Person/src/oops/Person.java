package oops;

//Class creation
public class Person {


//  Properties name and age=default-18
    String name;
    final int age = 18;

//    Constructor to initialize name and age
    public Person(String name,int age){
        this.name=name;
        age=age;

    }
//    Method to display output of name and age
    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);


    }

//    main method
    public static void main(String[] args) {

//        Person object initialized with name and age
        Person person=new Person("john",8);




        person.display();


    }

}

