package airline;

public class Passenger {

    private String name;

    private String contact;

    private int id;

public Passenger(String name, String contact, int id){
    this.name = name;
    this.contact = contact;
    this.id = id;
}




// Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
