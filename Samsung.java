package ico.fes;

public class Samsung implements Celular{

    private int tamañoRam;
    private int tamañoMemoria;
    private String color;
    private String modelo;
    private int resPant;

    public Samsung(int tamañoRam, int tamañoMemoria, String color, String modelo, int resPant) {
        this.tamañoRam = tamañoRam;
        this.tamañoMemoria = tamañoMemoria;
        this.color = color;
        this.modelo = modelo;
        this.resPant = resPant;
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

    public int getResPant() {
        return resPant;
    }

    public void setResPant(int resPant) {
        this.resPant = resPant;
    }

    @Override
    public String imprmir() {
       String r = "Tamaño de memoria: " + this.getTamañoMemoria()+"\n Tamaño de memoria RAM: "+this.getTamañoRam() + "\n Color :" + this.getColor()+"\n Modelo: "+this.getModelo()+"\n Resolución de pantalla: "+this.getResPant() ;
        return r;
    }

}
