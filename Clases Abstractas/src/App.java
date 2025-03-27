import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Loro jaimito = new Loro("Jaimito", "Verde", "Español", "LoritoColombiano");
        Torcaza Camilita = new Torcaza("Camilita", "Verde");
        jaimito.cantar();
        Camilita.cantar();
        ArrayList<Pajaro> pajaros = new ArrayList<Pajaro>();
        pajaros.add(jaimito);
        pajaros.add(Camilita);
        for (Pajaro pajaro : pajaros) {
            pajaro.cantar();
        }
    }
}
