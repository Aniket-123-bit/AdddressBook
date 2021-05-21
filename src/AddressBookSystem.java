import java.util.Scanner;
public class AddressBookSystem {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String pin;
    private String mobileNo;
    private String email;

    public AddressBookSystem(String firstName, String lastName, String city, String state, String pin, String mobileNo,
                       String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.mobileNo = mobileNo;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddressBookSystem [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
                + ", pin=" + pin + ", mobileNo=" + mobileNo + ", email=" + email + "]";
    }

}

 class Addressbooksystem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddressBookSystem add[] = new AddressBookSystem[10];
        int count = 0;
        String firstName;
        String lastName;
        String city;
        String state;
        String pin;
        String mobileNo;
        String email;


        System.out.println("Add Details ");

        System.out.println("Enter how many Address Details you want to add");
        int num=sc.nextInt();
        for(int i=0;i<num;i++) {
            System.out.println("Enter first and last name");
            firstName = sc.next();
            lastName = sc.next();
            System.out.println("Enter city");
            city = sc.next();
            System.out.println("Enter state");
            state = sc.next();
            System.out.println("Enter pin");
            pin = sc.next();
            System.out.println("Enter Mobile number");
            mobileNo = sc.next();
            System.out.println("Enter Email Id");
            email = sc.next();

            add[count] = new AddressBookSystem(firstName, lastName, city, state, pin, mobileNo, email);
        }
        count++;
        System.out.println("Details added successfully");
        System.out.println("All Details");
        for(int i = 0; i < count; i++) {
            System.out.println(add[i]);
        }




    }
}





