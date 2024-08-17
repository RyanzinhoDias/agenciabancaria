
public class Agencia {
    public String agencia;
    public String localAgencia;

    public Agencia(String agencia, String localAgencia) {
        this.agencia = agencia;
        this.localAgencia = localAgencia;
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
