package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String psw;
    private String department;
    private int defaultPasswordLength = 5;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive the first name and last name
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Call a method that returns a random password
        this.psw = randomPassword(defaultPasswordLength);
        System.out.println("Your password: " + this.psw);
    }
    // Ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Deveopment\n3 for Accounting\n0 for none\nEnter the department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    //Gernerate a random password
    private String randomPassword(int len) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[len];
        for (int i = 0; i < len; i++) {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //Set the mailbox capacity

    // Set the alternate email

    // Change the password
}