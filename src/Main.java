import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Lions", 212000);
        map1.put("Tigers", 333000);
        map1.put("Bears", 456000);
        map1.put("Elephants", 123000);
        map1.put("Gorillas", 321000);



        Scanner scanner = new Scanner(System.in);
        try (Scanner fileScanner = new Scanner(new File("sightings.txt"))) {

            // 3. Loop through the file as long as there is another line
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                map1.containsKey(line);
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
            //e.printStackTrace();
        }



        //System.out.println("Search Species ");
       //System.out.println("Enter a species name: ");
        //String species = scanner.nextLine();
        //if(map1.get(species) == null){
          //  System.out.println("Species not currently in registry. ");
        //}else {
          //  System.out.println("Species: " + species + " " + "Population: " + map1.get(species));
        //}

    }
}
