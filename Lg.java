package ico.fes;

public class Lg implements Celular{

    private int tamañoRam;
    private int tamañoMemoria;
    private String operador;

    public Lg(int tamañoRam, int tamañoMemoria, String operador) {
        this.tamañoRam = tamañoRam;
        this.tamañoMemoria = tamañoMemoria;
        this.operador = operador;
    }

    public int getTamañoRam() {
        return tamañoRam;
    }

    public void setTamañoRam(int tamañoRam) {
        this.tamañoRam = tamañoRam;
    }

    public int getTamañoMemoria() {
        return tamañoMemoria;
    }

    public void setTamañoMemoria(int tamañoMemoria) {
        this.tamañoMemoria = tamañoMemoria;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public String imprmir() {
        String r = "\n Tamaño de memoria RAM: "+this.getTamañoRam() +"\n Tamaño de memoria de almacenamiento: "+this.getTamañoMemoria()+"\n Operador: "+this.getOperador() ;
        return r;
    }
}
