import java.util.Scanner;


public class TekstasAtbulas {
    Scanner scanner = new Scanner(System.in);
    String scVerte;

    public void atbulas() {
        StringBuilder stringBuilder = new StringBuilder();
        String ivestis = ivestis();
        for(int i = ivestis.length()-1; i >= 0; i--){
            stringBuilder.append(ivestis.charAt(i));
        }
        System.out.println("Ivestas  tekstas: " + ivestis);
        System.out.println("Apsuktas tekstas: " + stringBuilder);
    }
    public String ivestis() {
        System.out.println("Iveskite teksta:");
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
