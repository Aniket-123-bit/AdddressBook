import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Search_By_Or_State {

    public static List<HashMap<String,String>> usersList = new ArrayList<HashMap<String,String>>();
    public static List<ArrayList<HashMap<String,String>>> state = new ArrayList<ArrayList<HashMap<String,String>>>();
    public static Scanner sc = new Scanner(System.in);

    public static String fName,lName;
    public static String Address,city;
    public static String isstate;
    public static String zip,phone;
    public static String email;


    public static String getUserInput()
    {

        System.out.println("Enter first and last name:");
        fName = sc.next();
        lName = sc.next();
        System.out.println("Enter Address:");
        Address = sc.next();
        System.out.println("Enter City:");
        city = sc.next();
        System.out.println("Enter state:");
        isstate = sc.next();
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
        userInfo.put("State",isstate);
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

        while(userDecision.equalsIgnoreCase("Y")) {
            userDecision = getUserInput();
        }

        System.out.println("Number of record by city:");
        System.out.println("Number of contacts in address book - " + usersList.size());

        System.out.println("Enter a person a you want to search:");
        String isCheck = sc.next();

        for( HashMap<String,String> user: usersList )
        {
            if(isCheck.equals(user.get("First Name")) )
            {
                System.out.println("This name present in the record:");
            }
        }


    }
}
