import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
 // Simulation class is responsible for reading and filling up Roket

public class Simulation {

    private ArrayList<Item> itemsList;

    // Default constructor for simulation
    public Simulation() {
        itemsList = new ArrayList<>();
    }


    public ArrayList<Item> readItems(String pathname) throws FileNotFoundException {
        try {
            File itemFile = new File(pathname);

            Scanner itemScanner = new Scanner(itemFile);

            while (itemScanner.hasNextLine()) {

                String fullItems = itemScanner.nextLine();
                String separator = "=";
                int index = fullItems.indexOf(separator);

                Item item = new Item(fullItems.substring(0,index),Integer.parseInt(fullItems.substring(index+1)));
                itemsList.add(item);
                //System.out.println(items);



            }

            itemScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // To print out phase.text
        System.out.println(pathname + " contains " + itemsList.size() + " items");
       for (Item i : itemsList) {
           System.out.println(i.name + ": " + i.weight);
        }
        System.out.println();
        return itemsList;

    }

    ArrayList<Roket> loadU1(ArrayList<Item> list) {
        ArrayList<Roket> fleet = new ArrayList<>();
        Roket r = new U1();

        int itemCounter = 1;
        int rocketCounter = 1;

        System.out.println("\nU1 Rocket weight = " + r.getWeight() + "; maxWeight = " + r.getMaxWeight());

        for (Item i : list) {

            while (!r.canCarry(i)) {
               System.out.println(" Adding next Item " + itemCounter + ": " + i.name + " = " + i.weight
                       + " failed -> No." + rocketCounter + " U1 full");

                rocketCounter++;
                fleet.add(r);
                r = new U1();
            }
            r.carry(i);

           System.out.println("Item " + itemCounter + ": " + i.name + " = " + i.weight + "; Rocket weight = "
                    + r.currentWeight + "; Item added");

            itemCounter++;
        }
        fleet.add(r);
        System.out.println("U1 fleet contains " + fleet.size() + " rockets");
        return fleet;
    }
}



