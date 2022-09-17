import java.util.Scanner;
public class aula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o código do funcionario\n");
        String codigo = teclado.nextLine();
        System.out.println("Digite o nome do funcionario");
        String nome = teclado.nextLine();
        System.out.println("Digite o e-mail");
        String email = teclado.nextLine();
        System.out.println("Digite o salario");
        double salario = teclado.nextDouble();
        System.out.println();
        System.out.println(codigo);
        System.out.println(nome);
        System.out.println(email);
        System.out.println(salario);
        System.out.println();
        System.out.println("Qual é quantidade de aumento que deseja? ");
        double aumento = teclado.nextDouble();
        double novo_Salario = salario * ((aumento/100)+1);
        System.out.println(novo_Salario);
        System.out.println("Qual é a porcentagem do imposto? ");
        double imposto = teclado.nextDouble();
        double novoimposto = ((100-imposto)/100)*novo_Salario;






        System.out.println("o valor com imposto é : "+novoimposto);



    }}