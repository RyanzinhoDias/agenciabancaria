import java.util.ArrayList;

public class Agencia {
    public String agencia;
    public String localAgencia;

    public Agencia() {
        this.agencia = "000";
        this.localAgencia = "Local Agencia";
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    String getAgencia(){
        return agencia;
    }

    public void setLocalAgencia(String localAgencia){
        this.localAgencia = localAgencia;
    }
    String getLocalAgencia(){
        return localAgencia;
    }

}
