
class Viento extends Instrumentos {


    public Viento(String nombre, double precio) {
        super(nombre, precio);
        tipoInstrumento=2;
    }

    public void tocar() {
        System.out.println("Está sonando un instrumento de viento");
    }



}
