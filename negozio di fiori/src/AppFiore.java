import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppFiore {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // chiedo di inserire tutti i dati di un fiore in un negozio di fiori
        boolean cont = true; //creo la variabile al di fuori del loop, così si può utilizzare dentro. al contrario non funziona. ciò che è creato in un loop non esiste fuori
        while(cont) { // come scrivere while(cont == true), ma giustamente se entrambe sono true basta scriverlo una volta sola

        System.out.println("Salva un nuovo fiore.");

        System.out.println("Nome");
        String nome = sc.nextLine();

        System.out.println("Tipologia");
        System.out.println("0 - ANNUALE");
        System.out.println("1 - PERENNE");
        System.out.println("2 - BULBOSO");
        System.out.println("3 - ARBUSTIVO");
        System.out.println("4 - TREPPIANTE");
        System.out.println("5 - ACQUATICO");
        Byte tipologiaNum = sc.nextByte();
        TipologiaFiore tipologiaFiore = TipologiaFiore.values()[tipologiaNum];
        //hardcoded TipologiaFiore tipologiaFiore = TipologiaFiore.ACQUATICO;
        
        System.out.println("Prezzo");
        Double prezzo = sc.nextDouble();

        System.out.println("Quantità");
        Short  quantità= sc.nextShort();
        sc.nextLine();

        System.out.println("Colore Principale");
        String colore = sc.nextLine();

        System.out.println("Periodo di disponibilità - inizio");
        String disponibilitàIn = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate DataIn = LocalDate.parse(disponibilitàIn, formatter);

        System.out.println("Periodo di disponibilità - fine");
        String disponibilitàFi = sc.nextLine();
        LocalDate DataFi = LocalDate.parse(disponibilitàFi, formatter);

        System.out.println("Profumo true/false");
        Boolean profumo = sc.nextBoolean();

        System.out.println("Artificiale true/false");
        Boolean artificiale = sc.nextBoolean();
        sc.nextLine();

        

        // mostro i dati ----------------------------------------------------


        System.out.println("Hai salvato il seguente fiore:");
        System.out.println("Nome: " +nome);
        System.out.println("Tipologia: " +tipologiaFiore);
        System.out.println("Prezzo: " +prezzo +"€");
        System.out.println("Quantità: " +quantità);
        System.out.println("Colore Principale: " +colore);
        System.out.println("Periodo di disponibilità - inizio: " +DataIn);
        System.out.println("Periodo di disponibilità - fine: " +DataFi);
        System.out.println("Profumo: " +profumo);
        System.out.println("Artificiale: " +artificiale);

        System.out.println("Vuoi inserire un altro fiore? true/false");
        cont = sc.nextBoolean();
        sc.nextLine();

        }

        System.out.println("Grazie!");

        sc.close();
    }
}
