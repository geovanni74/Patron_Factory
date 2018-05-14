package ico.fes;

public class Motorola implements Celular {

    private int tamañoRam;
    private String color;
    private String modelo;
    private String operador;

    public Motorola(int tamañoRam, String color, String modelo, String operador) {
        this.tamañoRam = tamañoRam;
        this.color = color;
        this.modelo = modelo;
        this.operador = operador;
    }

    public int getTamañoRam() {
        return tamañoRam;
    }

    public void setTamañoRam(int tamañoRam) {
        this.tamañoRam = tamañoRam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public String imprmir() {
        String r = "\n Tamaño de memoria RAM: "+this.getTamañoRam() + "\n Color :" + this.getColor()+"\n Modelo: "+this.getModelo()+"\n Operador: "+this.getOperador() ;
        return r;
    }
    
}
