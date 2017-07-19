// Adapter design pattern

public class Main {

    public static void main(String[] args) {

        LegacyContact oldContact = new LegacyContact();
        oldContact.setName("John Smith");

        // New system sets first and last names separately
        // Client indirectly uses the Adaptee via Target (Adapter)
        NewContactTarget target = new NewContactAdapter(oldContact);
        Client c1 = new Client();
        c1.setFirstName(target.getFirstName());
        c1.setLastName(target.getLastName());
        
        System.out.println(c1);
        
    }

}
