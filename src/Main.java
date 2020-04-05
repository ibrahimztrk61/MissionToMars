import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        Simulation simulation = new Simulation();
        ArrayList<Item> phase1 = simulation.readItems("Phase-1.txt");
        System.out.println();
        U1 u1 = new U1();
        u1.launch();
        simulation.loadU1(phase1);


    }
}