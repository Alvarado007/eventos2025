public abstract class Pajaro {
    private String nombre;
    private String colorplumaje;
    public Pajaro(String nombre, String colorplumaje) {
        this.nombre = nombre;
        this.colorplumaje = colorplumaje;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColorplumaje() {
        return colorplumaje;
    }
    public void setColorplumaje(String colorplumaje) {
        this.colorplumaje = colorplumaje;
    }
    public abstract void cantar();
    
    
}
