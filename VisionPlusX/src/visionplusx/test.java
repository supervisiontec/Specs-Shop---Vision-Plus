
import java.util.*;

class Example {

    public static void main(String args[]) {
        String[][] x = new String[4][2];
        Menu(x);
    }

    public static void Menu(String[][] x) {
        System.out.print("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tWELCOME TO GDSE MARKS MANAGEMENT SYSTEM");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println();

        System.out.print("[1]	Add New Student\t\t\t\t\t");
        System.out.println("[2]	Add New Student With Marks");
        System.out.print("[3]	Add Marks					");
        System.out.println("[4]	Update Student Details");
        System.out.print("[5]	Update Marks					");
        System.out.println("[6]	Delete Student");
        System.out.print("[7]	Print Student Details				");
        System.out.println("[8]	Print Student Ranks");
        System.out.print("[9]	Best in Programming Fundamentals		");
        System.out.println("[10]	Best in Database Management System");
        System.out.println();
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an option to continue > ");
        int op1 = input.nextInt();

        if (op1 == 1) {
            AddNewStudent(x);
        }
        if (op1 == 2) {
            AddNewStudentWithMarks(x);
        }
        //if(op1==3){AddMarks(x);}
    }

    public static void AddNewStudent(String[][] x) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\tADD NEW STUDENT");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        String isNext = "y";

        while ("y".equals(isNext)) {
            Boolean hasError = false;
            System.out.print("Enter Student ID : ");
            String id = input.nextLine();
            String name = "";
            int j = 0;

            for (j = 0; j < x[0].length; j++) {
                if (id.equals(x[0][j])) {
                    System.out.println("The Student ID already exists");
                    hasError = true;
                    j--;
                    break;
                }
            }
            if (!hasError) {
                System.out.print("Enter Student Name : ");
                name = input.nextLine();
                System.out.println();
                assing(x, id, name);

                System.out.print("Student has been added successfully. Do you want to add a new student (y/n) : ");
                isNext = input.nextLine();
                System.out.println();

            }
        }
        if ("n".equals(isNext)) {
            Menu(x);
        }
    }

    private static void AddNewStudentWithMarks(String[][] x) {
       for (int j = 0; j < x[0].length; j++) {
            System.out.println("ID "+x[0][j] + " NAME " + x[1][j] + " MASK " + x[2][j] + " RANK " + x[3][j]);
        }
    }

    private static void assing(String[][] x, String id, String name) {
        for (int i = 0; i < x[0].length; i++) {
            if (null == x[0][i]) {
                x[0][i] = id;
                x[1][i] = name;
                break;
            }
        }
    }
}
