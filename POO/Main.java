import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Conta conta = new Conta();

        conta.dono = "Luciano";
        conta.limite = 10000;
        conta.numero = 1;
        conta.saldo = 500;
        conta.extracto();

        conta.saca(200);
        conta.extracto();
        conta.saca(300);
        conta.deposita(3000);
        conta.extracto();


    }
}
