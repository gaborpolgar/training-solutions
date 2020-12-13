package catalog;

import arraylist.Books;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Catalog {

    public static void main(String[] args) {
        CatalogItem catalogItem = new CatalogItem("R-1", 300, new AudioFeatures("Night Visions", 185, Arrays.asList("Dan Raynolds"), Arrays.asList("Imagine Dragons")));
        Catalog catalog = new Catalog();
        catalog.addItem(catalogItem);
        System.out.println(catalog.catalogItems.size());
        boolean isTrue = catalog.catalogItems.size() == 1;
        System.out.println(isTrue);
    }

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem item){
        catalogItems.add(item);
    }

    public double averagePageNumberOver(int page) throws IllegalArgumentException {
if(page <= 0){
    IllegalArgumentException actualException = new IllegalArgumentException("Page number must be positive");
    throw actualException;
}
        double counter = 0;
        double totalPage = 0;
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.numberOfPagesAtOneItem() > page){
                totalPage += catalogItem.numberOfPagesAtOneItem();
                counter++;
            }
        }
        if(totalPage == 0){
            IllegalArgumentException actualException = new IllegalArgumentException("No page");
            throw actualException;
        }
        return totalPage/counter;

    }

    public void deleteItemByRegistrationNumber (String regNumber) {
        out: for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(regNumber)) {
                catalogItems.remove(catalogItem);
                break out;
            }
        }
    }

    public List<CatalogItem> findByCriteria (SearchCriteria criteria){
        List<CatalogItem> foundItems = new ArrayList<>();
        if (!(Validators.isBlank(criteria.getTitle()))){
            for (CatalogItem item: catalogItems) {
                for (String title: item.getTitles()) {
                    if (title.equals(criteria.getTitle())){
                        foundItems.add(item);
                    }
                }
            }
        } if (!(Validators.isBlank(criteria.getContributor()))){
            for (CatalogItem item: catalogItems) {
                for (String contributor: item.getContributors()) {
                    if (contributor.equals(criteria.getContributor())){
                        foundItems.add(item);
                    }
                }
            }
        }

        return foundItems;
    }

    public int getAllPageNumber() {
        int allPage = 0;
        for (CatalogItem catalogItem : catalogItems) {
            allPage += catalogItem.numberOfPagesAtOneItem();
        }
            return allPage;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioLibraryItems = new ArrayList<>();
        for (CatalogItem item : catalogItems) {
            if (item.hasAudioFeature()) {
                audioLibraryItems.add(item);
            }
        }
            return audioLibraryItems;
    }

        public int getFullLength () {
            int fullLength = 0;
            for (CatalogItem item: catalogItems) {
                fullLength += item.fullLengthAtOneItem();
            }
            return fullLength;
        }

        public List<CatalogItem> getPrintedLibraryItems () {
                List<CatalogItem> audioLibraryItems = new ArrayList<>();
            for (CatalogItem item : catalogItems) {
                //     if (item.hasAudioFeature()) {
                audioLibraryItems.add(item);
            //}
            }
                return audioLibraryItems;
        }
    }