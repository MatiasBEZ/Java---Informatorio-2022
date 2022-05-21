import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main (String[] args) {

        System.out.println("ingrese una palabra:");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                stringBuilder.append((char) (str.charAt(i) - 32));
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }

        System.out.println(stringBuilder);

    }
}
