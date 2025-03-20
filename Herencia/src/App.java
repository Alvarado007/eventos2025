import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        circulo circulo = new circulo(5.0f);
        System.out.println(circulo.area());
        Cilindro cilindro1= new Cilindro(6.7f,8.0f);
        System.out.println(cilindro1.area());
        JOptionPane.showMessageDialog(null, "Hola zunga");
    }
}
