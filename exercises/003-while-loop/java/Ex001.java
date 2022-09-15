public class Ex001 {

    public static void main(String[] args) {
        double alturaJoao = 134.0;
        double alturaPedro = 145.0;
        int ano = 1;

        while(alturaPedro >= alturaJoao) {
            alturaJoao  += 2.5;
            alturaPedro += 2.0;
            ano++;
        }
        System.out.println("Levaram " + ano + " anos para João ficar mais alto que Pedro.");
    }
}
