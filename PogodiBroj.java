package PogodiBroj;
import java.util.Scanner;
import java.util.Random;

public class PogodiBroj {
    public static void main(String[] args) {
        // Kreirao skener za input
        Scanner scanner = new Scanner(System.in);
        
        // Random objekt za random broj
        Random random = new Random();
        
        // Generisi random broj izmedju 1 i 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        
        // Pocetak igre
        System.out.println("Pogodi broj!");
        System.out.println("Zamisljam broj izmedju 1 i 100.");
        
        // Igra loop
        while (guess != numberToGuess) {
            System.out.println("Unesi broj:");
            guess = scanner.nextInt(); // Procitaj input
            numberOfTries++;
            
            // Provjera da li je input dobar, gore-dole
            if (guess < numberToGuess) {
                System.out.println("Broj je manji od rezultata. Probaj opet");
            } else if (guess > numberToGuess) {
                System.out.println("Broj je veci od rezultata. Probaj opet.");
            } else {
                System.out.println("Cestitamo! Pogodili ste broj iz " + numberOfTries + " pokusaja.");
            }
        }
        
        // Zatvori skeniranje
        scanner.close();
    }
}

