package br.com.fiap2espa;
import java.util.Scanner;
public class NotasV1 {    public static void main(String[] args)
{        Scanner leitor = new Scanner(System.in);
    System.out.println("=== Sistema de Notas ===");
    //Cadastro do primeiro aluno
    System.out.println("Digite o nome do aluno 1:");
     String nome1 = leitor.next();

     leitor.nextLine();

     double somaNotas = lerNota(leitor);

     double media1 = somaNotas / 3;
     if (media1 >= 6) {
         System.out.println(nome1 + " foi aprovado com média " + media1);
     } else {            System.out.println(nome1 + " foi reprovado com média " + media1);
     }
     //Cadastro do segundo aluno
    System.out.println("Digite o nome do aluno 2:");
     String nome2 = leitor.next();
     leitor.nextLine();
     somaNotas = lerNota(leitor);
     double media2 = somaNotas / 3;
     if (media2 >= 6) {
         System.out.println(nome2 + " foi aprovado com média " + media2);
     } else {            System.out.println(nome2 + " foi reprovado com média " + media2);
     }
    // Cadastro do terceiro aluno
    System.out.println("Digite o nome do aluno 3:");
     String nome3 = leitor.next();
     leitor.nextLine();
     somaNotas = lerNota(leitor);
     double media3 = (somaNotas) / 3;
     if (media3 >= 6) {
         System.out.println(nome3 + " foi aprovado com média " + media3);        }
     else {            System.out.println(nome3 + " foi reprovado com média " + media3);
     }
     leitor.close();
}    static double lerNota(Scanner leitor) {
    System.out.println("Digite a primeira nota de :");
    double n1a1 = leitor.nextDouble();
    System.out.println("Digite a segunda nota de :");
    double n2a1 = leitor.nextDouble();
    System.out.println("Digite a terceira nota de :");
    double n3a1 = leitor.nextDouble();
    return (n1a1 + n2a1 + n3a1);    }}




