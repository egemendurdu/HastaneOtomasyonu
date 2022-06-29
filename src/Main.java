import javax.print.Doc;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Doctor doktor1 = new Doctor(1,"Egemen","123123","Erkek","Everything",500000);
        doktor1.login("Egemen","123123");
        doktor1.iseBaslamaCikti();

        Patient patient2 = new Patient(2,"Taylan","123456","Kadın","ssk");
        patient2.login("Taylan","123456");
        patient2.randevuAl(12);

        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("kbb");
        arrayList1.add("ortopedi");

        Doctor doktor2 = new Doctor(1,"furkan","123123","erkek","abc",2200,arrayList1);
        System.out.println(doktor2.bolumler.get(1));


    }
}
