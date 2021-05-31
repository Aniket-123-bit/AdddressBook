package com.addressbook;
import java.util.*;

public class NoDuplicate_Entry {

    public static List<HashMap<String,String>> usersList = new ArrayList<HashMap<String,String>>();
    public static Scanner sc = new Scanner(System.in);

    public static String getUserInput()
    {
        String fName,lName;
        String Address,city;
        String state;
        String zip,phone;
        String email;

        System.out.println("Enter first and last name:");
        fName = sc.next();
        lName = sc.next();
        System.out.println("Enter Address:");
        Address = sc.next();
        System.out.println("Enter City:");
        city = sc.next();
        System.out.println("Enter state:");
        state = sc.next();
        System.out.println("Enter zip:");
        zip = sc.next();
        System.out.println("Enter phone:");
        phone = sc.next();
        System.out.println("Enter email:");
        email = sc.next();

        HashMap<String,String> userInfo = new HashMap<>();
        userInfo.put("First Name",fName);
        userInfo.put("Last Name", lName);
        userInfo.put("Address", Address);
        userInfo.put("city", city);
        userInfo.put("State",state);
        userInfo.put("Zip", zip);
        userInfo.put("contact", phone);
        userInfo.put("email_Id", email);

        boolean userExist= false;
        for(HashMap<String,String> user: usersList) {
            String emailId = user.get("email_Id");
            if(emailId.equalsIgnoreCase(email)) {
                userExist = true;
            }
        }

        if(userExist) {
            //
        } else {
            usersList.add(userInfo);
        }

        System.out.println("Do you want to add contact in address book (M/N)");
        return sc.next();
    }

    public static void main(String args[]) {

        System.out.println("Do you want to add contact in address book (M/N)");
        String userDecision = sc.next();

        while(userDecision.equalsIgnoreCase("N")) {
            userDecision = getUserInput();
        }


    }

}

