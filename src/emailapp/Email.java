package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String psw;
    private String email;
    private String department;
    private int defaultPasswordLength = 5;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

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

        // Combine elements to generate emali
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + companySuffix;
        System.out.println("Your email is: " + email);
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
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.psw = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPsw() {
        return psw;
    }

    public void showInfo() {
        System.out.println( "DISPLAY NAME:" + firstName + " " + lastName +
                "\nCOMPANY NAME: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb");
    }
}