import java.util.Scanner;
public class Employee{
    String name;
    int age;
    double salary;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Employee mahi = new Employee();
        System.out.print("Enter employee name: ");
        mahi.name = input.nextine();
        System.out.print("Enter employee age: ");
        mahi.age = input.nextInt();
        System.out.print("Enter employee salary: ");
        mahi.salary = input.nextDouble();
        System.out.println("Employee name: " + mahi.name);
        System.out.println("Employee age: " + mahi.age);
        System.out.println("Employee salary: " + mahi.salary);


    }
}