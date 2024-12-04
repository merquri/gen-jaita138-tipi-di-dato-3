import java.util.Scanner;

public class AppFornitore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cont = true;
        while(cont) { System.out.println("Salva un nuovo fornitore");

        System.out.println("Nome");
        String nome= sc.nextLine();

        System.out.println("Categoria");
        System.out.println("0 - PIANTE");
        System.out.println("1 - VASELLAME");
        System.out.println("2 - CONCIME");
        System.out.println("3 - GIARDINAGGIO");
        Byte categoriaNum = sc.nextByte();
        CategoriaFornitore categoriaFor = CategoriaFornitore.values()[categoriaNum];
        sc.nextLine();

        System.out.println("Partita IVA");
        String piva= sc.nextLine();

        System.out.println("Luogo");
        String luogo=sc.nextLine();

        System.out.println("Telefono");
        String telefono=sc.nextLine();

        System.out.println("E-Mail");
        String email=sc.nextLine();

        System.out.println("IBAN");
        String iban=sc.nextLine();

        System.out.println("Nome Referente");
        String nomeRef=sc.nextLine();

        System.out.println("Note");
        String note=sc.nextLine();

        System.out.println("Lingua");
        String lingua=sc.nextLine();

        // mostro i dati inseriti

        System.out.println("------------------------------------------------------------");
        System.out.println("Ecco il fornitore che hai salvato:");

        System.out.println("Nome:" +nome);
        System.out.println("Categoria:" +categoriaFor);
        System.out.println("Partita IVA: " +piva);
        System.out.println("Luogo: " +luogo);
        System.out.println("Numero di telefono: " +telefono);
        System.out.println("E-mail: " +email);
        System.out.println("IBAN: " +iban);
        System.out.println("Nome Referente: " +nomeRef);
        System.out.println("Note: " +note);
        System.out.println("Lingua: " +lingua);

        System.out.println("Vuoi procedere con la creazione di un nuovo fornitore? true/false");
        cont = sc.nextBoolean();
        sc.nextLine();
    }
    System.out.println("Grazie!");
    sc.close();

        
    }
}
