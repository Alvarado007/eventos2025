public class circulo {
    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public circulo(float radio) {
        this.radio = radio;
    }

    public float area() {
        return (float)(radio * radio * Math.PI);
    }
    
}
