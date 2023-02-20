import java.util.Scanner;

public class Main { private String name;private int age;private String dept;

    public boolean add(String name,int age,String dept){
        if (this.name==null){
            this.name=name;}
        if (this.age==0) {
            this.age=age;}
        if (this.dept==null){
        this.dept=dept;}
        return true;
    }


    public void display(){
        System.out.println("----------------------------------------");
        System.out.println("employee name " +name);
        System.out.println("employee age " +age);
        System.out.println("employee dept "+dept);
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("Enter the choice");
            System.out.println("1. Register " + "2. View employee details " + " 3.Update employee details  " + " 4.Delete employee details " + " 5.Exit");

            op = sc.nextInt();

            switch (op) {
                case 1 -> {
                    if (obj.name == null) {
                        sc.nextLine();
                        System.out.println("enter the employee name");
                        String input = sc.nextLine();
                        System.out.println("enter the employee age");
                        int age_input = sc.nextInt();
                        sc.nextLine();
                        System.out.println("enter the employee dept");
                        String dept_input = sc.nextLine();

                        boolean output = obj.add(input, age_input, dept_input);

                        if (output) {
                            System.out.println("*******************************************");
                            System.out.println("employee added successfully");
                            System.out.println("*******************************************");
                        } else {
                            System.out.println("employee added already");

                        }
                    } else {
                        System.out.println("Employee already added please delete the existed one");
                    }
                }
                case 2 -> obj.display();
                case 3 -> {
                    System.out.println("enter the employee name");
                    sc.nextLine();
                    String name_update = sc.nextLine();
                    System.out.println("enter the employee age");
                    int age_update = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter the employee dept");
                    String dept_update = sc.nextLine();
                    obj.add(name_update, age_update, dept_update);
                }
                case 4 -> {
                    System.out.println("to confirm delete press 1");
                    int delete_input = sc.nextInt();
                    if (delete_input == 1) {
                        obj.name = null;
                        obj.dept = null;
                        obj.age = 0;
                        System.out.println();
                        System.out.println("Employee deleted successfully !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println();
                    }
                }
                case 5 -> {
                    System.out.println("Do you wish to exit press 1");
                    int exit_input = sc.nextInt();
                    if (exit_input == 1) {
                        System.out.println("thank you !!!!!!");
                        return;
                    }

                }
                default -> System.out.println("invalid entry");
            }
        } while (true);


    }}
