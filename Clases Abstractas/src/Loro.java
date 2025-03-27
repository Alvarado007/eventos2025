public class Loro extends Pajaro implements Mascota, AnimalesDeCirco {
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
    @Override
    public String getDueño() {
        return "Juan";
    }
    @Override
    public String getFechadevacuna() {
        return "10/10/2020";
    }
    @Override
    public void HacerTrucos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'HacerTrucos'");
    }
    @Override
    public void despedirse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'despedirse'");
    }   

}
