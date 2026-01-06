import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);

        System.out.println("Digite o teu nome: ");
        String name = sc.next();

        System.out.println("Seja Bem-vindo: "+ name);
    }
}