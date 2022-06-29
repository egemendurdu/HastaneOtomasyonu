public class Patient extends User{
    public String insurance;

    public Patient(int id, String username, String password, String gender, String insurance) {
        super(id, username, password, gender);
        this.insurance = insurance;
    }

    public void randevuAl(int saat){
        System.out.println(saat+" e randevu alindi.");
    }
}
