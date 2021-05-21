import java.util.Scanner;
 class Person {

    private String pFname, pLname;
    private String pAddr, pCity, pEmail;
    private String pPhone, pZip;

    public void setFname_Lname(String FirstName,String LastName)
    {
        pFname = FirstName;
        pLname = LastName;
    }

    public void setAddr_pCity(String personAddr, String personCity)
    {
        pAddr = personAddr;
        pCity = personCity;
    }

    public void setEmail_pPhone(String personEmail , String personPhone)
    {
        pEmail = personEmail ;
        pPhone = personPhone ;
    }

    public void setZip(String person_zip)
    {
        pZip = person_zip;
    }

    public String getAddr()
    {
        return pAddr;
    }

    public String getCity()
    {
        return pCity;
    }

    public String getFirstName()
    {
        return pFname;
    }

    public String getLastName()
    {
        return pLname;
    }

    public String getEmail()
    {
        return pEmail;
    }

    public String getPhone()
    {
        return pPhone;
    }

    public String getzip()
    {
        return pZip;
    }

    public Person(String Fname, String Lname, String paddr, String pcity ,String pemail, String phn_no, String pzip)
    {
        setFname_Lname(Fname, Lname);
        setAddr_pCity(paddr, pcity);
        setEmail_pPhone(pemail, phn_no);
        setZip(pzip);
    }
}
 class Addressbooksystem
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[7];
        int i;
        String Fname, Lname, Addr, city, email, phone, zip;
        Person obj = new Person("Aniket", "Raikwar","AbcArea", "Bhopal", "anny@gmail.com", "89686799","471201");
        Fname=obj.getFirstName();
        Lname=obj.getLastName();
        Addr=obj.getAddr();
        city=obj.getCity();
        email=obj.getEmail();
        phone=obj.getPhone();
        zip=obj.getzip();

        arr[0] = Fname;
        arr[1] = Lname;
        arr[2] = Addr;
        arr[3] = city;
        arr[4] = email;
        arr[5] = phone;
        arr[6] = zip;

        System.out.println("Person data in array:");

        for ( i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Enter location you need to update:");
        int loc = scan.nextInt();
        System.out.println("Enter which you want to be update:");
        String isEdit = scan.next();
        System.out.println("Enter your Zip for verification:");
        String isZip = scan.next();

        for( i = loc; i< arr.length; i++ )
        {
            if ( isZip.equals(zip) && i == loc )
            {
                arr[i]=isEdit;
            }
        }

        System.out.println("Array after modification:");
        for( i = 0; i <arr.length; i++ )
        {
            System.out.println(arr[i]);
        }
    }
}




