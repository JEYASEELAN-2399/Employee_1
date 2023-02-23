import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Employee_test {

    public static void main(String[] args) {

        Collection<Employee> c= new ArrayList<Employee>();
        Scanner sc=new Scanner(System.in);
        Scanner in=new Scanner(System.in);


        int op;
        do {System.out.println("Enter the choice");
            System.out.println("1. Register " + "2. View employee details " + " 3.Update employee details  " + " 4.Delete employee details " + " 5.Exit");

            op = in.nextInt();

            switch (op) {
                case 1 -> {

                        System.out.println("enter the employee name");
                        String name_input = sc.nextLine();
                        System.out.println("enter the employee age");
                        int age_input = in.nextInt();
                        System.out.println("enter the employee dept");
                        String dept_input = sc.nextLine();

                        c.add(new Employee(name_input,age_input,dept_input));

                        break;}

                case 2 ->{

                    System.out.println("---------------------------------------------------");

                    Iterator<Employee> i=c.iterator();
                    while(i.hasNext()){
                        Employee e=i.next();
                        System.out.println(e);
                    }
                    System.out.println("---------------------------------------------------");
                    break;}



            }

        }while(true);







    }





}
