import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

public class Doctor extends User{
    public String departmant;
    public int salary;
    public ArrayList<String> bolumler;



    public void iseBaslamaCikti(){
        System.out.println("bAsladi");
    }

    public Doctor(int id, String username, String password, String gender, String departmant, int salary) {
        super(id, username, password, gender);
        this.departmant = departmant;
        this.salary = salary;
    }

    public Doctor(int id, String username, String password, String gender, String departmant, int salary, ArrayList<String> bolumler) {
        super(id, username, password, gender);
        this.departmant = departmant;
        this.salary = salary;
        this.bolumler = bolumler;
    }

    @Override
    public void login(String username, String password) {
        super.login(username, password);
        System.out.println("Hosgeliniz Doktor "+username);

    }
    /*
    public int iseBaslama(int saat){
        return saat;
    }

     */

}
