import javax.swing.JFrame;

public class App extends JFrame {
    public App() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello, World!");
        setSize(800, 600);
        setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App app = new App();
    }
}
