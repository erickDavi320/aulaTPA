public class Ex001 {

    public static void main(String[] args) {

        for (int i= 1;i<=10;i++){
            System.out.println("\nEssa é a tabuada do ["+ i +"]\n");
            for (int j = 1; j < 11; j++) {
                int v = i * j;
                System.out.println(i + " X " + j + " = "+ v);
            }
        }
    }
}
