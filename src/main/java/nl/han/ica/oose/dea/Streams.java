package nl.han.ica.oose.dea;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Streams {

    List<String> filterStringsLongerThanThreeCharacters(List<String> input) {
        var result = input.stream().filter((element) -> element.length() < 3).collect(Collectors.toList());

        return result;
    }

    List<String> filterStringsThanContainOnlyNumerals(List<String> input) {
        var result = input.stream().filter((element) -> isInteger(element)).collect(Collectors.toList());

        return result;
    }

    String findShortestString(List<String> input) {
        var shortestString = input.stream().min(Comparator.comparingInt(String::length));

        return shortestString.orElse("");
    }


    private boolean isInteger(String element) {
        try {
            Integer.parseInt(element);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }


    String createAFullSentenceFromTheList(List<String> input) {
        var fullSentence = input.stream().reduce((s1, s2) -> s1 + " " + s2);

        return fullSentence.orElse("");
    }

    int calculateCompleteCostOfAllProducts(List<Product> products) {
        var totalCost = products.stream().mapToInt(Product::getPrice).reduce(0, (p1, p2) -> p1 + p2);
        return totalCost;
    }


    public static class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}
