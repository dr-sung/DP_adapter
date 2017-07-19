/*
 * Participant: Client
 */

public class Client {
    
    private String first;
    private String last;
    
    public void setFirstName(String first) {
        this.first = first;
    }
    
    public void setLastName(String last) {
        this.last = last;
    }
    
    @Override
    public String toString() {
        return "First name: " + first + " | Last name: " + last;
    }
    
}
