package ico.fes;

public class Sony implements Celular {

    private int tamanoMemoria;
    private String color;
    private String operador;
    private String SistOP;
    private String ResCam;

    public Sony(int tamañoMemoria, String color, String operador, String SistOP, String ResCam) {
        this.tamanoMemoria = tamañoMemoria;
        this.color = color;
        this.operador = operador;
        this.SistOP = SistOP;
        this.ResCam = ResCam;
    }

    public int getTamañoMemoria() {
        return tamanoMemoria;
    }

    public void setTamañoMemoria(int tamañoMemoria) {
        this.tamanoMemoria = tamañoMemoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
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

    @Override
    public String imprmir() {
        String r = "Tamaño de memoria: " + this.getTamañoMemoria() + "\n Color :" + this.getColor() + "\n Operador: " + this.getOperador() + "\n Resolución de la camara: " + this.getResCam() + "\n Sistema Operativo: " + this.getSistOP();
        return r;

    }

}
