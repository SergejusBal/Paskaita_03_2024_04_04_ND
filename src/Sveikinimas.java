import javax.xml.transform.Source;
import java.util.Scanner;

public class Sveikinimas {

    Scanner scanner = new Scanner(System.in);
    String scVerte;

    public void sveikinimas(){
        System.out.println("Sveikinu " + vardas() + "!");
    }

    public String vardas(){
        System.out.println("Iveskite varda:");
        return scanner.nextLine();
    }

    public boolean atsakymas() {
        while(true) {
            System.out.println("Iveskite (T/N)?");
            scVerte = scanner.nextLine();
            if(scVerte.toUpperCase().equals("T")) return true;
            else if (scVerte.toUpperCase().equals("N")) return false;
        }
    }
}
