public class Person {
    private String name;
    private String lastname;
    private String email;
    private String address;


    // constructor vacio
    public Person() {
    }
    // constructor parametrizado

    public Person(String name, String lastname, String email, String address) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.address = address;

    }

    // Guters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String soy(){
        return "soy persona";
    }

    }
