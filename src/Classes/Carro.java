package Classes;

public class Carro {
    private int id;
    private String modelo;
    private String cor;
    private int potencia;
    
    public Carro() {
    }

    public Carro(int id, String modelo, String cor, int potencia) {
        this.id = id;
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    
    
    

    
}
