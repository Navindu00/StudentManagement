import java.util.*;

public class Student {
    public static String[] id = new String[0];
    public static String[] studentName = new String[0];
    public static int[] marksPRF = new int[0];
    public static int[] marksDBMS = new int[0];
    public static int[] total = new int[0];
    public static double[] avg = new double[0];
    public static int op;

    public static void main(String args[]) {
        homePage();
        op = optionSelection();

        while (op < 11) {
            while (op == 1) {
                addStudents();
                op = optionSelection();
                
            }

            while (op == 2) {
                addStudentsWithMarksLayout();
                op = optionSelection();
            }

            while (op == 3) {
                addMarks();
                op = optionSelection();
            }

            while (op == 4) {
                updateStudentDetail();
                op = optionSelection();
            }

            while (op == 5) {
                updateMarksLayout();
                op = optionSelection();
            }

            while (op == 6) {
                deleteStudent();
                op = optionSelection();
            }

            while (op == 7) {
                printStudentDetailsLayout();
                op = optionSelection();
            }

            while (op == 8) {
                printStudentsRanks();
                op = optionSelection();
            }

            while (op == 9) {
                bestInPRF();
                op = optionSelection();
            }

            while (op == 10) {
                bestInDBMS();
                op = optionSelection();
            }
        }
    }

    public static void homePage() {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tWELCOME TO GDSE DATA MANAGEMENT SYSTEM\t\t\t\t|");
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("[1]  Add New Student                  \t\t[2]   Add New Student With Marks");
        System.out.println("[3]  Add Marks                        \t\t[4]   Update Student Details");
        System.out.println("[5]  Update Marks                     \t\t[6]   Delete Student");
        System.out.println("[7]  Print Student Details            \t\t[8]   Print Students Ranks");
        System.out.println("[9]  Best in Programming Fundamentals \t\t[10]  Best in Database Management System");

    }

    public static int optionSelection() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an option to continue > ");
        int option = input.nextInt();
        clearConsole();
        return option;
    }

    public static void addStudents() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tADD NEW STUDENT\t\t\t\t|");
        System.out.println("-------------------------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        addNewStudent();

        System.out.println();
        System.out.print("Student has been added successfully. Do you want to add a new student? (Y/n): ");
        String command = input.next();

        if (command.equals("Y") || command.equals("y")) {
            clearConsole();
            addStudents();
        } else {
            clearConsole();
            homePage();
        }
    }

    public static void addStudentsWithMarksLayout() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\tADD NEW STUDENT WITH MARKS\t\t\t|");
        System.out.println("-------------------------------------------------------------------------");

        System.out.println();
        Scanner input = new Scanner(System.in);

        addStudentsWithMarks();
        System.out.println();
        System.out.print("Student has been added successfully. Do you want to add a new student? (Y/n): ");
        String command = input.next();

        if (command.equals("Y") || command.equals("y")) {
            clearConsole();
            addStudentsWithMarksLayout();
        } else {
            clearConsole();
            homePage();
        }
    }

    public static void addMarks() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tADD MARKS\t\t\t\t|");
        System.out.println("-------------------------------------------------------------------------");

        System.out.println();

        Scanner input = new Scanner(System.in);
        String option = addMarksToStudent();

        if (!option.equals("Y") & !option.equals("y")) {
            clearConsole();
            homePage();
            return;
        }

        System.out.println();
        System.out.print("Marks has been added successfully. Do you want to add marks for another student? (Y/n): ");
        String command = input.next();

        if (command.equals("Y") || command.equals("y")) {
            clearConsole();
            addMarks();
        } else {
            clearConsole();
            homePage();
        }
    }

    public static void updateStudentDetail() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tUPDATE STUDENT DETAILS\t\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID\t: ");
        String sid = input.next();

        System.out.println();

        updateStudentDetails(sid);

        System.out.println();
        System.out.println("Student details has been added successfully");
        System.out.print("Do you want to update another student details? (Y/n): ");
        String command = input.next();

        if (command.equals("Y") || command.equals("y")) {
            clearConsole();
            updateStudentDetail();
        } else {
            clearConsole();
            homePage();
        }
    }

    public static void updateMarksLayout() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tUPDATE MARKS\t\t\t\t|");
        System.out.println("-------------------------------------------------------------------------");

        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.println();
        String command = updateMarks();

        if (command.equals("Y") || command.equals("y")) {
            clearConsole();
            updateMarksLayout();
        } else {
            clearConsole();
            homePage();
        }
    }

    public static void deleteStudent() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tDELETE STUDENT\t\t\t\t|");
        System.out.println("-------------------------------------------------------------------------");

        System.out.println();
        Scanner input = new Scanner(System.in);
        deleteStudentFromArrays();

        System.out.println();

        System.out.println("Student has been deleted successfully");
        System.out.print("Do you want to delete another student? (Y/n): ");
        String command = input.next();

        if (command.equals("Y") || command.equals("y")) {
            clearConsole();
            deleteStudent();
        } else {
            clearConsole();
            homePage();
        }
    }

    public static void printStudentDetailsLayout() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tPRINT STUDENT DETAILS\t\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println();
        Scanner input = new Scanner(System.in);
        
        sortTotal();
        printStudentDetails();

        System.out.println();

        System.out.print("Do you want to search another student details? (Y/n): ");
        String command = input.next();

        if (command.equals("Y") || command.equals("y")) {
            clearConsole();
            printStudentDetailsLayout();
        } else {
            clearConsole();
            homePage();
        }
    }

    public static void printStudentsRanks() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tPRINT STUDENTS' RANKS\t\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        sortTotal();

        System.out.println();

        System.out.println("+-------+------+------------------------+------------------+----------------+");
        System.out.println("|Rank   |ID    |Name                    |Total Marks       |Avg. Marks      |");
        System.out.println("+-------+------+------------------------+------------------+----------------+");
        for (int i = 0; i < total.length; i++) {
            if (total[i] != 0) {
                System.out.print("|  " + (i + 1) + "\t| " + id[i] + " |" + studentName[i]);
            for(int j=0; j<= (23-studentName[i].length()); j++){
                System.out.print(" ");
            }
            System.out.print("|");
            if(total[i]<100){
                System.out.print("\t\t "+total[i]);
            }else{
                System.out.print("\t\t"+total[i]);
            }
            System.out.println("| \t\t" + avg[i] + "|");
            }
        }
        System.out.println("+-------+------+------------------------+------------------+----------------+");
        System.out.println();

        System.out.print("Do you want to go back to main menu? (Y/n): ");
        String command = input.next();

        if (command.equals("Y") || command.equals("y")) {
            clearConsole();
            homePage();
        }
    }

    public static void bestInPRF() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|\t\t\tBEST IN PROGRAMMING FUNDAMENTALS\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        sortPRF();
        System.out.println();

        System.out.println("+------+------------------------+------------------+----------------+");
        System.out.println("|ID    |Name                    |PRF Marks         |DBMS Marks      |");
        System.out.println("+------+------------------------+------------------+----------------+");

        for (int i = 0; i < marksPRF.length; i++) {
            if (marksPRF[i] != 0) {
                System.out.println("| " + id[i] + " |" + studentName[i] + "\t\t\t|\t\t " + marksPRF[i] + "|\t\t  "
                        + marksDBMS[i] + "|");
            }
        }
        System.out.println("+------+------------------------+------------------+----------------+");

        System.out.print("Do you want to go back to main menu? (Y/n): ");
        String command = input.next();

        if (command.equals("Y") || command.equals("y")) {
            clearConsole();
            homePage();
        }
    }

    public static void bestInDBMS() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|\t\t\tBEST IN DATABASE MANAGEMENT SYSTEM\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        sortDBMS();
        System.out.println();

        System.out.println("+------+------------------------+------------------+----------------+");
        System.out.println("|ID    |Name                    |DBMS Marks        |PRF Marks       |");
        System.out.println("+------+------------------------+------------------+----------------+");

        for (int i = 0; i < marksDBMS.length; i++) {
            if (marksDBMS[i] != 0) {
                System.out.println("| " + id[i] + " |" + studentName[i] + "\t\t\t|\t\t " + marksDBMS[i] + "|\t\t  "+ marksPRF[i] + "|");
            }
        }
        System.out.println("+------+------------------------+------------------+----------------+");

        System.out.print("Do you want to go back to main menu? (Y/n): ");
        String command = input.next();

        if (command.equals("Y") || command.equals("y")) {
            clearConsole();
            homePage();
        }
    }

    public static void printStudentDetails() {
        Scanner input = new Scanner(System.in);
        int index = -1;
        L1:while (true) {
            System.out.print("Enter Student ID\t: ");
            String sid = input.next();

            L2:for (int i = 0; i < id.length; i++) {
                if (sid.equals(id[i])) {
                    index = i;
                    break L1;
                }
            }

            if(index == -1){
                System.out.println("Invalid index");
            }
        }

        System.out.println("Student Name\t\t: " + studentName[index]);
        if (marksPRF[index] != 0) {
            System.out.println("+---------------------------------------+-------------------+");
            System.out.println("|Programming Fundamentals Marks\t\t|\t\t  " + marksPRF[index] + "|");
            System.out.println("|Data Base Management System Marks\t|\t\t  " + marksDBMS[index] + "|");
            System.out.println("|Total marks\t\t\t\t|\t\t " + total[index] + "|");
            System.out.println("|Average\t\t\t\t|\t\t" + avg[index] + "|");
            if (index == 0) {
                System.out.println("|Rank\t\t\t\t\t|\t    " + (index + 1) + "(First)|");
            } else if (index == 1) {
                System.out.println("|Rank\t\t\t\t\t|\t   " + (index + 1) + "(Second)|");
            } else if (index == 2) {
                System.out.println("|Rank\t\t\t\t\t|\t    " + (index + 1) + "(Third)|");
            } else if (index == id.length - 1) {
                System.out.println("|Rank\t\t\t\t\t|\t     " + (index + 1) + "(Last)|");
            } else {
                System.out.println("|Rank\t\t\t\t\t|\t\t   " + (index + 1) + "|");
            }
            System.out.println("+---------------------------------------+-------------------+");
        } else {
            System.out.println();
            System.out.println("Marks yet to be added.");
        }

    }

    public static void updateStudentDetails(String sid) {
        Scanner input = new Scanner(System.in);

        int index = 0;
        for (int i = 0; i < id.length; i++) {
            if (sid.equals(id[i])) {
                index = i;
            }
        }
        System.out.println("Student Name\t\t: " + studentName[index]);

        System.out.print("Enter the new student name: ");
        String newName = input.next();

        String[] newStudentName = new String[studentName.length];
        for (int i = 0; i < index; i++) {
            newStudentName[i] = studentName[i];
        }
        newStudentName[index] = newName;
        for (int i = index + 1; i < studentName.length; i++) {
            newStudentName[i] = studentName[i];
        }
        studentName = newStudentName;
    }

    public static String updateMarks() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID\t: ");
        String sid = input.next();
        String command = " ";

        int index = 0;
        for (int i = 0; i < id.length; i++) {
            if (sid.equals(id[i])) {
                index = i;
            }
        }
        System.out.println("Student Name\t\t: " + studentName[index]);
        System.out.println();

        if (marksPRF[index] != 0) {
            System.out.println("Programming Fundamental Marks\t\t: " + marksPRF[index]);
            System.out.println("Database Management System Marks\t: " + marksDBMS[index]);
            System.out.println();
            System.out.print("Enter new Programming Fundamental Marks\t\t: ");
            int newPRFMarks = input.nextInt();

            System.out.print("Enter new Database Management System Marks\t: ");
            int newDBMSMarks = input.nextInt();

            int[] newMarksPRF = new int[marksPRF.length];
            for (int i = 0; i < index; i++) {
                newMarksPRF[i] = marksPRF[i];
            }
            newMarksPRF[index] = newPRFMarks;
            for (int i = index + 1; i < marksPRF.length; i++) {
                newMarksPRF[i] = marksPRF[i];
            }
            marksPRF = newMarksPRF;

            int[] newMarksDBMS = new int[marksDBMS.length];
            for (int i = 0; i < index; i++) {
                newMarksDBMS[i] = marksDBMS[i];
            }
            newMarksDBMS[index] = newDBMSMarks;
            for (int i = index + 1; i < marksDBMS.length; i++) {
                newMarksDBMS[i] = marksDBMS[i];
            }
            marksDBMS = newMarksDBMS;

            int newTotalValue = newPRFMarks + newDBMSMarks;
            double newAvgValue = newTotalValue / 2.0;

            int[] newTotal = new int[total.length];
            for (int i = 0; i < index; i++) {
                newTotal[i] = total[i];
            }
            newTotal[index] = newTotalValue;
            for (int i = index + 1; i < total.length; i++) {
                newTotal[i] = total[i];
            }
            total = newTotal;

            double[] newAvg = new double[avg.length];
            for (int i = 0; i < index; i++) {
                newAvg[i] = avg[i];
            }
            newAvg[index] = newAvgValue;
            for (int i = index + 1; i < avg.length; i++) {
                newAvg[i] = avg[i];
            }
            avg = newAvg;

            System.out.print(
                    "Marks have been added successfully.\nDo you want to update marks for another student? (Y/n): ");
            command = input.next();
        } else {
            System.out.print(
                    "This student's marks yet to be added.\nDo you want to update marks of another student? (Y/n): ");
            String option = input.next();

            if (option.equals("Y") || option.equals("y")) {
                clearConsole();
                updateMarksLayout();
            } else {
                clearConsole();
                homePage();
            }
        }
        return command;

    }

    public static void deleteStudentFromArrays() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID\t: ");
        String idNum = input.next();

        int index = 0;
        for (int i = 0; i < id.length; i++) {
            if (idNum.equals(id[i])) {
                index = i;
            }
        }

        String[] newId = new String[id.length - 1];
        for (int i = 0; i < index; i++) {
            newId[i] = id[i];
        }
        for (int i = index + 1; i < newId.length; i++) {
            newId[i] = id[i + 1];
        }
        id = newId;

        String[] newStudentName = new String[studentName.length - 1];
        for (int i = 0; i < index; i++) {
            newStudentName[i] = studentName[i];
        }
        for (int i = index + 1; i < newStudentName.length; i++) {
            newStudentName[i] = studentName[i + 1];
        }
        studentName = newStudentName;

        int[] newMarksPRF = new int[marksPRF.length - 1];
        for (int i = 0; i < index; i++) {
            newMarksPRF[i] = marksPRF[i];
        }
        for (int i = index + 1; i < newMarksPRF.length; i++) {
            newMarksPRF[i] = marksPRF[i + 1];
        }
        marksPRF = newMarksPRF;

        int[] newMarksDBMS = new int[marksDBMS.length - 1];
        for (int i = 0; i < index; i++) {
            newMarksDBMS[i] = marksDBMS[i];
        }
        for (int i = index + 1; i < newMarksDBMS.length; i++) {
            newMarksDBMS[i] = marksDBMS[i + 1];
        }
        marksDBMS = newMarksDBMS;

        int[] newTotal = new int[total.length - 1];
        for (int i = 0; i < index; i++) {
            newTotal[i] = total[i];
        }
        for (int i = index + 1; i < newTotal.length; i++) {
            newTotal[i] = total[i + 1];
        }
        total = newTotal;

        double[] newAvg = new double[avg.length - 1];
        for (int i = 0; i < index; i++) {
            newAvg[i] = avg[i];
        }
        for (int i = index + 1; i < newAvg.length; i++) {
            newAvg[i] = avg[i + 1];
        }
        avg = newAvg;
    }

    public static void sortTotal() {
        for (int j = total.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (total[i] < total[i + 1]) {
                    int t = total[i];
                    total[i] = total[i + 1];
                    total[i + 1] = t;

                    String temp = id[i];
                    id[i] = id[i + 1];
                    id[i + 1] = temp;

                    String nameTemp = studentName[i];
                    studentName[i] = studentName[i + 1];
                    studentName[i + 1] = nameTemp;

                    double tempAvg = avg[i];
                    avg[i] = avg[i + 1];
                    avg[i + 1] = tempAvg;

                    int tempPRF = marksPRF[i];
                    marksPRF[i] = marksPRF[i + 1];
                    marksPRF[i + 1] = tempPRF;

                    int tempDBMS = marksDBMS[i];
                    marksDBMS[i] = marksDBMS[i + 1];
                    marksDBMS[i + 1] = tempDBMS;
                }
            }
        }
    }

    public static void sortPRF() {
        for (int j = marksPRF.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (marksPRF[i] < marksPRF[i + 1]) {
                    int tempPRF = marksPRF[i];
                    marksPRF[i] = marksPRF[i + 1];
                    marksPRF[i + 1] = tempPRF;

                    int tempDBMS = marksDBMS[i];
                    marksDBMS[i] = marksDBMS[i + 1];
                    marksDBMS[i + 1] = tempDBMS;

                    String temp = id[i];
                    id[i] = id[i + 1];
                    id[i + 1] = temp;

                    String nameTemp = studentName[i];
                    studentName[i] = studentName[i + 1];
                    studentName[i + 1] = nameTemp;
                }
            }
        }
    }

    public static void sortDBMS() {
        for (int j = marksDBMS.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (marksDBMS[i] < marksDBMS[i + 1]) {
                    int tempDBMS = marksDBMS[i];
                    marksDBMS[i] = marksDBMS[i + 1];
                    marksDBMS[i + 1] = tempDBMS;

                    int tempPRF = marksPRF[i];
                    marksPRF[i] = marksPRF[i + 1];
                    marksPRF[i + 1] = tempPRF;

                    String temp = id[i];
                    id[i] = id[i + 1];
                    id[i + 1] = temp;

                    String nameTemp = studentName[i];
                    studentName[i] = studentName[i + 1];
                    studentName[i + 1] = nameTemp;
                }
            }
        }
    }

    public static void addNewStudent() {

        Scanner input = new Scanner(System.in);
        System.out.println();
        L1: while (true) {
            System.out.print("Enter Student ID\t: ");
            String idnum = input.next();

            L2: for (int i = 0; i < id.length; i++) {
                if (idnum.equals(id[i])) {
                    System.out.println("The Student ID already exists");
                    continue L1;
                }
            }
            String[] idTemp = new String[id.length + 1];
            for (int j = 0; j < id.length; j++) {
                idTemp[j] = id[j];
            }
            idTemp[idTemp.length - 1] = idnum;
            id = idTemp;

            System.out.print("Enter Student Name\t: ");
            String name = input.next();

            String[] nameTemp = new String[studentName.length + 1];
            for (int i = 0; i < studentName.length; i++) {
                nameTemp[i] = studentName[i];
            }
            nameTemp[nameTemp.length - 1] = name;
            studentName = nameTemp;

            int length = id.length;
            int[] newPRF = new int[length];
            for (int i = 0; i < marksPRF.length; i++) {
                newPRF[i] = marksPRF[i];
            }
            int[] newDBMS = new int[length];
            for (int i = 0; i < marksDBMS.length; i++) {
                newDBMS[i] = marksDBMS[i];
            }
            int[] newTotal = new int[length];
            for (int i = 0; i < total.length; i++) {
                newTotal[i] = total[i];
            }
            double[] newAvg = new double[length];
            for (int i = 0; i < avg.length; i++) {
                newAvg[i] = avg[i];
            }

            marksPRF = newPRF;
            marksDBMS = newDBMS;
            total = newTotal;
            avg = newAvg;
            break;
        }

    }

    public static void addStudentsWithMarks() {
        Scanner input = new Scanner(System.in);

        L1: while (true) {
            System.out.print("Enter Student ID\t: ");
            String idnum = input.next();

            L2: for (int i = 0; i < id.length; i++) {
                if (idnum.equals(id[i])) {
                    System.out.println("The Student ID already exists");
                    continue L1;
                }
            }
            String[] idTemp = new String[id.length + 1];
            for (int j = 0; j < id.length; j++) {
                idTemp[j] = id[j];
            }
            idTemp[idTemp.length - 1] = idnum;
            id = idTemp;

            System.out.print("Enter Student Name\t: ");
            String name = input.next();
            System.out.println();

            String[] nameTemp = new String[studentName.length + 1];
            for (int i = 0; i < studentName.length; i++) {
                nameTemp[i] = studentName[i];
            }
            nameTemp[nameTemp.length - 1] = name;
            studentName = nameTemp;

            int index = 0;
            for (int i = 0; i < id.length; i++) {
                if (idnum.equals(id[i])) {
                    index = i;
                }
            }

            while (true) {
                System.out.print("Programming Fundamental Marks\t\t: ");
                int prfMarks = input.nextInt();

                if (prfMarks < 0 || prfMarks > 100) {
                    System.out.println("Invalid marks, Please Enter correct marks");
                    continue;
                }

                int[] newPRF = new int[index + 1];
                for (int i = 0; i < marksPRF.length; i++) {
                    newPRF[i] = marksPRF[i];
                }
                newPRF[index] = prfMarks;
                marksPRF = newPRF;
                break;
            }

            while (true) {
                System.out.print("Database Management System Marks\t: ");
                int dbmsMarks = input.nextInt();

                if (dbmsMarks < 0 || dbmsMarks > 100) {
                    System.out.println("Invalid marks, Please Enter correct marks");
                    continue;
                }

                int[] newDBMS = new int[index + 1];
                for (int i = 0; i < marksDBMS.length; i++) {
                    newDBMS[i] = marksDBMS[i];
                }
                newDBMS[index] = dbmsMarks;
                marksDBMS = newDBMS;
                break;
            }

            int totalValue = marksPRF[index] + marksDBMS[index];

            int[] newTotal = new int[index + 1];
            for (int i = 0; i < total.length; i++) {
                newTotal[i] = total[i];
            }
            newTotal[index] = totalValue;
            total = newTotal;

            double avgValue = (marksPRF[index] + marksDBMS[index]) / 2.0;

            double[] newAvg = new double[index + 1];
            for (int i = 0; i < avg.length; i++) {
                newAvg[i] = avg[i];
            }
            newAvg[index] = avgValue;
            avg = newAvg;

            break;
        }
    }

    public static String addMarksToStudent() {
        Scanner input = new Scanner(System.in);
        int index = -1;
        String option = "Y";
        L1: while (option.equals("Y") || option.equals("y")) {
            index = -1;
            System.out.print("Enter Student ID\t: ");
            String sid = input.next();

            L2: for (int i = 0; i < id.length; i++) {
                if (sid.equals(id[i])) {
                    index = i;
                    break L1;
                }
            }
            if (index == -1) {
                System.out.print("Invalid Student ID. Do you want to search again (Y/n): ");
                option = input.next();
            }

            if (!option.equals("Y") & !option.equals("y")) { 
                return option;
            }

        }

        System.out.println();

        if (marksPRF[index] != 0) {
            System.out.println(
                    "This student's marks have been already added.\nIf you want to update the marks, Plaese use [4] Upadte Marks option.");
            System.out.println();
            System.out.print("Do you want to add marks for another student? (Y/n): ");
            option = input.next();

            if (option.equals("Y") || option.equals("y")) {
                clearConsole();
                addMarks();
            } else {
                return option;
            }
        }

        int prfMarks = 0;
        int dbmsMarks = 0;

        while (true) {
            System.out.print("Programming Fundamental Marks\t\t: ");
            prfMarks = input.nextInt();

            if (prfMarks < 0 || prfMarks > 100) {
                System.out.println("Invalid marks, Please enter Correct marks.");
                continue;
            } else {
                break;
            }

        }

        while (true) {
            System.out.print("Database Management System Marks\t: ");
            dbmsMarks = input.nextInt();

            if (dbmsMarks < 0 || dbmsMarks > 100) {
                System.out.println("Invalid marks, Please enter Correct marks.");
                continue;
            } else {
                break;
            }
        }

        int totalValue = prfMarks + dbmsMarks;
        double avgValue = totalValue / 2.0;

        marksPRF[index] = prfMarks;
        marksDBMS[index] = dbmsMarks;
        total[index] = totalValue;
        avg[index] = avgValue;

        return option;
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();  
        }
    }

}