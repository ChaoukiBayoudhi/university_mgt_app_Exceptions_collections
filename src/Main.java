import StudentManagement.Group;
import StudentManagement.Student;

import java.util.Scanner;

public class Main {
    public static int menu(){
        System.out.println("Select one choice [1..7]:");
        System.out.println("1. Add student");
        System.out.println("2. Remove student");
        System.out.println("3. List students");
        System.out.println("4. Modify student");
        System.out.println("5. Get admitted students");
        System.out.println("6. Get average grade for a group");
        System.out.println("7. Exit");
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
        }while(choice<1 || choice>7);
        return choice;
    }
    public static void main(String[] args) {
        Group g1=new Group();
        int choice;
        Scanner sc=new Scanner(System.in);
        do {
            choice=menu();
            switch (choice){
                case 1:
                    System.out.println("Add student");
                    //Create a new Student object
                    Student st=new Student();
                    //Set the attributes of the student
                    System.out.println("Enter the CIN: ");
                    st.setCin(sc.next());
                    System.out.println("Enter the name: ");
                    st.setName(sc.next());
                    System.out.println("Enter the family name: ");
                    st.setFamilyName(sc.next());
                    //...
                    //Add the student to the group
                    g1.addStudent(st);
                    break;
                case 2:
                    System.out.println("Remove student");
                    break;
                case 3:
                    System.out.println("List students");
                    break;
                case 4:
                    System.out.println("Modify student");
                    break;
                case 5:
                    System.out.println("Get admitted students");
                    break;
                case 6:
                    System.out.println("Get average grade for a group");
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
            }
        }while(choice!=7);
    }
}