import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Lions", 212000);
        map1.put("Tigers", 333000);
        map1.put("Bears", 456000);
        map1.put("Elephants", 123000);
        map1.put("Gorillas", 321000);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Search Species ");
        System.out.println("Enter a species name: ");
        String species = scanner.nextLine();
        if(map1.get(species) == null){
            System.out.println("Species not currently in registry. ");
        }else {
            System.out.println(species + " " + map1.get(species));
        }
    }
}
