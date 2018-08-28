import java.util.Random;

public class Escola {
    public static void main(String[] args) {
        Notas[][]minhasNotas= new Notas[4][4];

        int l,c;

        for (l=0;l<4;l++){
          for (c=0;c<4;c++){
              Notas nota=new Notas();
              Random rand= new Random();
              nota.g1=rand.nextInt(10);///TC.nextInt
              nota.g2=rand.nextInt(10);
              nota.media=(nota.g1+(nota.g2*2))/3;
              minhasNotas[l][c]=nota;
        } }

        for (l=0;l<4;l++){
            for (c=0;c<4;c++){

               if(minhasNotas[l][c].media>7){
                   System.out.println("Aprovado");
               }else if(minhasNotas[l][c].media>6 && minhasNotas[l][c].media<7){
                   System.out.println("Exame");
               }else{
                   System.out.println("Reprovado em EDII");
               }

            } }

}}
