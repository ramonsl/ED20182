package Aula05;

public class Metodos {

    public static void main(String[] args) {
        int[] vetor= {3,8,9};
     //   mostraMensagem();
      //  mostraMensagem("Ramon");
        int a=soma(3,3);
        //System.out.println(a);
        //System.out.println(soma(4,2));
        mostraVetor(vetor);
    }
    public static int soma(int a, int b){
        return a+b;
    }

    public  void mostraMensagem(){
        System.out.println("Boa noite ");
    }
    public  void mostraMensagem(String nome){
        System.out.println("Boa noite "+nome);
    }

    public static void mostraVetor(int [] valores){
        for(int i=0;i<valores.length;i++){
            System.out.println(valores[i]);
        }

    }
}


