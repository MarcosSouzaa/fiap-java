package estruturas;

public class Arrays {

    public static void main(String[] args) {

         float[] valores = new float[5];

         valores[0] = 10;
         valores[1] = 20;
         valores[2] = 30;
         valores[3] = 40;


         System.out.println("Quantidade de itens do array: " + valores.length);
         System.out.println("Acesso ao índice 1: " + valores[0]);
         System.out.println("Acesso ao índice 2: " + valores[1]);
         System.out.println("Acesso ao índice 3: " + valores[2]);
         System.out.println("Acesso ao índice 4: " + valores[3]);
         System.out.println("Acesso ao índice 5: " + valores[4]);

    }
}
