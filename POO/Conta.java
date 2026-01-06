
public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;

    boolean saca(double valor){
        if (this.saldo < valor){
            return false;
        }
        
        this.saldo -= valor;
        return true;
        
    }

    void deposita(double quantidade){
        this.saldo += quantidade;
    }

    boolean transferePara(Conta destino, double valor){
        if (this.saca(valor)){
            destino.deposita(valor);
            return true;
        }
        return false;
    }


    void extracto(){
        System.out.println("=====================================");
        System.out.println("Proprietario: "+this.dono);
        System.out.println("Numero: "+this.numero);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Limite de conta:"+this.limite);
        System.out.println("=====================================");
    }
}
