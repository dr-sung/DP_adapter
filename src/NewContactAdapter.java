/*
 * participant: Adapter
 */
public class NewContactAdapter implements NewContactTarget {
    
    private final LegacyContact oldContact;
    
    public NewContactAdapter(LegacyContact oldContact) {
        this.oldContact = oldContact;
    }

    @Override
    public String getFirstName() {
        return oldContact.getName().split(" ")[0];
    }

    @Override
    public String getLastName() {
        return oldContact.getName().split(" ")[1];
    }
    
}
