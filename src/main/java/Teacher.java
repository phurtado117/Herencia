public class Teacher extends Person{

    public Teacher() {
    }

    public Teacher(String name, String lastname, String email, String address) {
        super(name, lastname, email, address);
    }

    public String soy(){
        return "soy maestro";
    }
    public String toString() {
        System.out.println("maestro");
        System.out.println("nombre: "+getName());
        System.out.println("apellido: "+getLastname());
        System.out.println("direccion: "+getAddress());
        System.out.println("email: "+getEmail());
        return null;
    }
}
