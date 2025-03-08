package oops;

//Class creation
public class persons {


    //  Properties name and age=default-18
    String name;
     int age;

    //    Constructor to initialize name and age
    public persons(String name,int age){
        this.name=name;
        this.age=age;

    }
    //    Method to display output of name and age
    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);


    }

    //    main method
    public static void main(String[] args) {

        persons person=new persons("naveen",20);

        Employee emplyeeinfo=new Employee("john",10,001,20000);



        person.display();
        emplyeeinfo.displayEmployee();


    }

}

class Employee extends persons{

    int employeeId;
    double salary;
    public Employee(String name, int age,int employeeId,double salary) {
        super(name, age);

        this.employeeId=employeeId;
        this.salary=salary;
    }

    public void displayEmployee(){
        display();
        System.out.println("EmployeeID: "+employeeId);
        System.out.println("Salary: "+salary);

    }
}

