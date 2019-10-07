import java.lang.Math;


public class Email_Id {
    String firstName;
    String lastName;
    String companyName;
    int year;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getYear() {
        return year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Email_Id(String firstName, String lastName, String companyName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.year = year;
    }
    public void emailId(){
        System.out.println(firstName.toLowerCase()+"."+lastName.toLowerCase()+"_"+companyName.toLowerCase()+"@gmail.com");

    }
    public void password(){
        for (int i=0;i<6;i++){
            int d = (int)(Math.random()*8)+1;
            System.out.print(d);




        }



    }


    public static void main(String[] args) {
        Email_Id e = new Email_Id("Vivek","Singh","Google",1999);
        Email_Id e1 = new Email_Id("Abhishek","Gupta","Microsoft",2019);
        System.out.print("Email Id is : ");
        e.emailId();
        System.out.print("Password IS : ");
        e.password();
        System.out.println();
        System.out.print("Email Id is : ");
        e1.emailId();
        System.out.print("Password IS : ");
        e1.password();



    }



}
