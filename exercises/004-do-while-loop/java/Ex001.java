
public class Ex001 {

    public static void main(String[] args) {
        int i = 0;

        System.out.println("Numeros pares:");
        do {
            System.out.print((i % 2 == 0) ? i + " " : "");
            i++;
        } while(i <= 500);
    }
}
