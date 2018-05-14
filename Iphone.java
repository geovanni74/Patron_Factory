package ico.fes;

public class Iphone implements Celular{
    private int tamanoRam;
    private int tamañoMemoria;
    private String color;

    public Iphone(int tamañoRam, int tamañoMemoria, String color) {
        this.tamanoRam = tamañoRam;
        this.tamañoMemoria = tamañoMemoria;
        this.color = color;
    }

    public int getTamanoRam() {
        return tamanoRam;
    }

    public void setTamanoRam(int tamanoRam) {
        this.tamanoRam = tamanoRam;
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

    @Override
    public String imprmir() {
        String r = "Tamaño de memoria: " + this.getTamañoMemoria() + "\n Color :" + this.getColor() + "Tamaño de memoria RAM: "+this.getTamanoRam();
        return r;
    }
    
   

}
