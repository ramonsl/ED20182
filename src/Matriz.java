import java.util.Random;

public class Matriz {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        int tam=1000;

        int[][] matriz = new int[tam][tam];
        int l,c;

        l=0;
        c=0;
        for(l=0;l<tam;l++){
            for(c=0;c<tam;c++){
                Random rand= new Random();
                matriz[l][c]=rand.nextInt(2);
            }
        }

     long tempoI=    System.currentTimeMillis();
        for(l=0;l<tam;l++){
            for(c=0;c<tam;c++){
                System.out.print(matriz[l][c]+ " |");
            }
            System.out.println("");
        }
        long tempoF=    System.currentTimeMillis();

        System.out.println("Tempo ="+(tempoF-tempoI));




    }
}
