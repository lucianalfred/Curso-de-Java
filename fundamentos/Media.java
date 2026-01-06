import java.util.Scanner;

public class Media{

    public static void main(String[] args)
    {
        Scanner buffer = new Scanner(System.in);
        double x, y, media;

        System.out.print("Digite o primeiro numero: ");
        x = buffer.nextDouble();
        System.out.print("Digite o segundo numero: ");
        y = buffer.nextDouble();

        media = (x + y) / 2.0;
        System.out.print("Meida = "+media); 
    
    }
}