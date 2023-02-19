import java.util.Scanner;

public class Main { private String name;private int age;private String dept;

    public void add(String name,int age,String dept){
        if (name!=null){
            this.name=name;}
        if (age!=0) {
            this.age=age;}
        if (dept!=null){
        this.dept=dept;}

        else{
            System.out.println("illegal entry");
        }

    }


    public void display(){
        System.out.println("----------------------------------------");
        System.out.println("employee name " +name);
        System.out.println("employee age " +age);
        System.out.println("empoyee dept "+dept);
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("Enter the choice");
            System.out.println("1. Register " + "2. View employee details " + " 3.Update employee details  " + " 4.Delete employee details");

            op = sc.nextInt();

            switch (op) {
                    case 1:
                        sc.nextLine();
                        System.out.println("enter the employee name");
                        String input = sc.nextLine();
                        System.out.println("enter the employee age");
                        int age_input=sc.nextInt();
                        sc.nextLine();
                        System.out.println("enter the employee dept");
                        String dept_input=sc.nextLine();

                        obj.add(input,age_input,dept_input);
                        break;

                    case 2:
                        obj.display();
                        break;

                default :
                    System.out.println("invalid entry");

            }
        } while (true);


    }}
