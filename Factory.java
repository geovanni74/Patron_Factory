package ico.fes;

public class Factory {

    public static Celular crearCelular(String type) {
        if (type.equals(Celular.IPHONE)) {

            return new Iphone(4, 32, "Blanco");

        } else if (type.equals(Celular.MOTOROLA)) {
            return new Motorola(4, "Blanco", "Moto G", "Telcel");
        } else if (type.equals(Celular.SONY)) {
            return new Sony(16, "Negro", "Movistar", "Android 8", "13 MP.");
        } else if (type.equals(Celular.HUAWEI)) {
            return new Huawei(4, 64, "Negro", "Android 8", "20 MP.", "Telcel");
        } else if (type.equals(Celular.SAMSUNG)) {
            return new Samsung(2, 16, "Dorado", "Galaxy 3", 1080);
        } else if (type.equals(Celular.LG)) {
            return new Lg(2, 16, "Unefon");

        } else {
            return null;
        }
    }
}
