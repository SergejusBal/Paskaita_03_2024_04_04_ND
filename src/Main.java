//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////
        //////////////// Uzduotis 1

        System.out.println();
        System.out.println("Uzduotis 1");
        System.out.println();

       // new Sveikinimas().sveikinimas();
       // System.out.println();

        Sveikinimas sveikinimas = new Sveikinimas();

        System.out.println("Ar norite pasveikinti?");
        boolean testi = sveikinimas.atsakymas();

        while(testi) {
            sveikinimas.sveikinimas();
            System.out.println("Ar norite pasveikinti?");
            testi = sveikinimas.atsakymas();
        }

        ///////////////////////////////////////////////////////////
        //////////////// Uzduotis 2

        System.out.println();
        System.out.println("Uzduotis 2");
        System.out.println();

        Skaiciok skaiciok = new Skaiciok();

        System.out.println("Ar norite atlikti aritmetinius veikmus?");
        testi = skaiciok.atsakymas();

        while(testi) {
            skaiciok.operacija();
            System.out.println("Ar norite atlikti aritmetinius veikmus?");
            testi = skaiciok.atsakymas();
        }

        ///////////////////////////////////////////////////////////
        //////////////// Uzduotis 3

        System.out.println();
        System.out.println("Uzduotis 3");
        System.out.println();

        TekstasAtbulas atbulas = new TekstasAtbulas();

        System.out.println("Ar norite apversti zodzius?");
        testi = atbulas.atsakymas();

        while(testi) {
            atbulas.atbulas();
            System.out.println("Ar norite apversti zodzius?");
            testi = atbulas.atsakymas();
        }


    }
}