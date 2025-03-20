import java.util.Vector;

public class Cilindro extends circulo{
    private float altura;
    public Cilindro(float radio, float altura) {
        super(radio);
        this.altura = altura;
    }
    public float area() {
        return super.area() *altura;
    }

}
