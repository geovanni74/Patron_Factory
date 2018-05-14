package ico.fes;

public class Huawei implements Celular{

    private int tamañoRam;
    private int tamañoMemoria;
    private String color;
    private String SistOP;
    private String ResCam;
    private String operador;

    public Huawei(int tamañoRam, int tamañoMemoria, String color, String SistOP, String ResCam, String operador) {
        this.tamañoRam = tamañoRam;
        this.tamañoMemoria = tamañoMemoria;
        this.color = color;
        this.SistOP = SistOP;
        this.ResCam = ResCam;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSistOP() {
        return SistOP;
    }

    public void setSistOP(String SistOP) {
        this.SistOP = SistOP;
    }

    public String getResCam() {
        return ResCam;
    }

    public void setResCam(String ResCam) {
        this.ResCam = ResCam;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public String imprmir() {
String r = "\n Tamaño de memoria RAM: "+this.getTamañoRam() +"\n Tamaño de memoria de almacenamiento: "+this.getTamañoMemoria()+"\n Color: "+this.getColor()+"\n Sistema operativo: "+this.getSistOP()+"\n Resolución de camara: "+this.getResCam()+"\n Operador: "+this.getOperador() ;
        return r;
    }
     
    
   

}
