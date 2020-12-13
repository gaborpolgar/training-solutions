package catalog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private List<Feature> features;
    private int price;
    private String registrationNumber;

    CatalogItem(String registrationNumber, int price, Feature ... features){
    this.registrationNumber = registrationNumber;
    this.price = price;
    this.features = Arrays.asList(features);
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;
        if (!Validators.isEmpty(features)){
            for (Feature feature : features) {
                if (feature instanceof AudioFeatures) {
                    fullLength += ((AudioFeatures) feature).getLength();
                }
            }
        }
        return fullLength;
    }

    public List<String> getContributors() {
            List<String> allContr = new ArrayList<>();
        if (!Validators.isEmpty(features)) {
 /*           for (int i = 0; i < features.size(); i++) {
                allContr.addAll(features.get(i).getContributors());
            }*/
            for (Feature feature : features) {
                allContr.addAll(feature.getContributors());
            }
        }
            return allContr;
    }

    public List<String> getTitles() {
            List<String> titles = new ArrayList<>();
        if (!Validators.isEmpty(features)) {
            for (Feature feature : features) {
                titles.add(feature.getTitle());
            }
        }
            return titles;
    }

    public boolean hasAudioFeature() {
        if (!Validators.isEmpty(features)) {
            for (Feature feature : features) {
                if (feature instanceof AudioFeatures) {
                    return true;
                }
            }
        }
            return false;
    }

    public boolean hasPrintedFeature() {
        if (!Validators.isEmpty(features)) {
            for (Feature feature : features) {
                if (feature instanceof PrintedFeatures) {
                    return true;
                }
            }
        }
            return false;
    }

    public int numberOfPagesAtOneItem() {
            int totalPages = 0;
        if (!Validators.isEmpty(features)) {
            for (Feature feature : features) {
                if (feature instanceof PrintedFeatures) {
                    totalPages += ((PrintedFeatures) feature).getNumberOfPages();
                }
            }
        }
            return totalPages;
    }

    public List<Feature> getFeatures(){
        return features;
    }

    public int getPrice(){
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
