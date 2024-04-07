import java.util.Scanner;

public class KidsCalculator {
    Scanner scanner = new Scanner(System.in);
    String scVerte;

    public void operacija(){
        int sk1 = skaicius();
        int sk2 = skaicius();
        System.out.println("Suma: " + (sk1 + sk2));
        System.out.println("Skirtumas: " + (sk1 - sk2));
    }

    public int skaicius() {
        int sk = 0;
        boolean tikrinti =true;
        while(tikrinti) {
            System.out.println("Iveskite sveika skaiciu:");
            scVerte = scanner.nextLine();
            for(int i = 0; i < scVerte.length(); i++){
                if(!Character.isDigit(scVerte.charAt(i))) {
                    break;
                }
                else if (i==scVerte.length()-1){
                    tikrinti = false;
                    sk = Integer.valueOf(scVerte);
                }
            }
        }
        return sk;
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
