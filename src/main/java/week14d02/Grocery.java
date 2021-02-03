package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class Grocery {

    private Map<String, List<String>> purchases = new HashMap<>();

    public static void main(String[] args) {
        Grocery gro = new Grocery();
        gro.readFromFile();
        System.out.println(gro.getPurchases());
        System.out.println(gro.getPurchasedItems("K8921"));
        System.out.println(gro.getAmountByProduct("sugar"));
        gro.getSumProductsByIndentifier("K8921");
        System.out.println(gro.getStatisticsAmountOfProducts().toString());
    }

    private Map<String, Integer> getStatisticsAmountOfProducts() {
//        Collection<String> temp;
        Set<String> noDups = new HashSet<>();
        Map<String, Integer> stat = new HashMap<>();
        //Set<String> products = new Set<>();
        for (List<String> products : purchases.values()) {
          //temp = new HashSet<String>(products);
          noDups.addAll(products);
            }
        for (String product: noDups) {
            stat.put(product, getAmountByProduct(product));
        }
        return stat;
        }

    private int getSumProductsByIndentifier(String identifier) {
        return getPurchasedItems(identifier).size();
        }

    private int getAmountByProduct(String product) {
        int counter = 0;
        for (List<String> products: purchases.values()) {
            for (String prod: products) {
                if (product.equals(prod)){
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    public Map<String, List<String>> getPurchases() {
        return purchases;
    }

    public List<String> getPurchasedItems(String identifier){
        for (Map.Entry<String, List<String>> purchase: purchases.entrySet())
        {
            if (identifier.equals(purchase.getKey())){
                return purchase.getValue();
            }
        }
        System.out.println("Do not found pruchased items by given identifier");
        return null;
    }


    public Map<String, List<String>> readFromFile() {
    Path file = Path.of("src\\main\\resources\\shopping.txt");
    String line;
    try (BufferedReader reader = Files.newBufferedReader(file)){
            while ((line = reader.readLine()) != null){
                String [] parts = line.split(" ");
                List<String> purchase = new ArrayList<>(List.of(parts[1].split(",")));
                Collections.sort(purchase);
                Collections.sort(purchase);
            purchases.put(parts[0], purchase);
            }
        }
    catch (IOException ioe){
        throw new IllegalStateException("Can not read the file!", ioe);
        }
    return purchases;
    }
}
