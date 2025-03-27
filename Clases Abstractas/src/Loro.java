public class Loro extends Pajaro{
    private String idioma;
    private String raza;
    public Loro(String nombre, String colorplumaje, String idioma, String raza) {
        super(nombre, colorplumaje);
        this.idioma = idioma;
        this.raza = raza;
    }
    @Override
    public void cantar() {
        System.out.println("quiere cacao mi rey?");
    }   

}
