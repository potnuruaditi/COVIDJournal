public class Contact{
    public String firstName;
    public String lastName;
    public String number;

    public Contact (String a, String b, String c){
        firstName = a;
        lastName = b;
        number = c;
    }

    public String toString(){
        return (firstName + " " + lastName + ": " + number);
    }
    
}