import java.util.Scanner;

public class Wejscie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = in.nextLine();
        System.out.println("Twoje imie to: " + name);
        System.out.println("Ile masz lat?");
        int wiek = in.nextInt();
        System.out.println("Masz " + wiek + " lat.");
    }
}
