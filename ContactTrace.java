public class ContactTrace {

    public static void main (String [] args){
        if (needToCall()){
           
            StdOut.println();
            StdOut.println("Calling the following contacts:");
            StdOut.println();
            
            Contact [] contacts = getContacts("contactList.txt"); //contacts list is the list of people you have had contact with within a 2-week period 
            for (Contact c: contacts){
                StdOut.println(c);
            }
        }
    }
    
    public static boolean needToCall () {
        
        StdOut.println("Would you like to alert friends from Calendar through Twilio?");
        
        String response = StdIn.readString();
       
        if (response == "yes"){
            return true;
        }
        
        if (response == "no"){
            return false;
        }

        return true;

    }

    public static Contact [] getContacts (String file){

        In inFile = new In(file);

        int numberContacts = 0;

        while (!inFile.isEmpty()){ 
            
            inFile.readString();

            numberContacts = numberContacts + 1;
            numberContacts = numberContacts / 3;
        }

        Contact [] contactList = new Contact [numberContacts];
        
         
            while (!inFile.isEmpty()){
                
                for (int a = 0; a < numberContacts; a++){
                   
                    for (int i = 0; i < 3; i++){
                        String firstName;
                        String lastName;
                        String phoneNumber;
                        
                        String [] contactData = new String [3];
                        firstName = contactData[0];
                        lastName = contactData[1];
                        phoneNumber = contactData[2];
                        
                        contactList[a] = new Contact (firstName, lastName, phoneNumber);

                    } 
                }
            }   
                  
    
        return contactList;
    }
}