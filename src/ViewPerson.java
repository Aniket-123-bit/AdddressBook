import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class ViewPerson {
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

        usersList.add(userInfo);

        System.out.println("Do you want to add contact in address book (M/N)");
        return sc.next();
    }

    public static void main(String args[]) {

        System.out.println("Do you want to add contact in address book (M/N)");
        String userDecision = sc.next();

        while(userDecision.equalsIgnoreCase("M")) {
            userDecision = getUserInput();
        }


        System.out.println("Search by City or State:");
        String isSearch = sc.next();

        System.out.println("********Details******:");

        for(HashMap<String,String> user: usersList)
        {
            if(isSearch.equals(user.get("city")) || isSearch.equals(user.get("State")))
            {
                System.out.println("Record details: ");
                System.out.println("First Name : " + user.get("First Name"));
                System.out.println("Last Name : " + user.get("Last Name"));
                System.out.println("Address : " + user.get("Address"));
                System.out.println("city : " + user.get("city"));
                System.out.println("State : " + user.get("State"));
                System.out.println("Zip : " + user.get("Zip"));
                System.out.println("email_Id : " + user.get("email_Id"));
                System.out.println("contact : " + user.get("contact"));

            }
        }
    }


}
