public class Student extends Person{
    private int controlNumber;
    private String career;
    private double generalAverage;



    public Student() {
    }


    public Student(String name, String lastname, String email, String address,int controlNumber, String career,
                   double generalAverage) {
        super(name, lastname, email, address);

        this.controlNumber = controlNumber;
        this.career = career;
        this.generalAverage = generalAverage;

    }


    public int getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public double getGeneralAverage() {
        return generalAverage;
    }

    public void setGeneralAverage(double generalAverage) {
        this.generalAverage = generalAverage;
    }

    public String soy(){
        return "soy estudiante";

    }
    public String toString() {

            System.out.println("Estudiante");
            System.out.println("nombre: "+getName());
            System.out.println("apellido: "+getLastname());
            System.out.println("direccion: "+getAddress());
            System.out.println("email: "+getEmail());
        System.out.println("numero de control"+getControlNumber());
            return null;
    }

}
