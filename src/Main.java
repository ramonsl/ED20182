import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vetores[] = new int[10];
        float notas[] = new  float[24];

        Aluno alunos[]= new Aluno[10];

    int i=0;

        Scanner teclado = new Scanner(System.in);

        while (i<10){
            Aluno aluno= new Aluno();
            aluno.nome=teclado.next();
            aluno.nota=8.9f;
            alunos[i]=aluno;
            i++;
            aluno.mostra();
        }

        System.out.println(alunos[0].nota);

        Aluno b= new Aluno();
        b.nome="Daniela";
        b.nota=9f;


    }




}
