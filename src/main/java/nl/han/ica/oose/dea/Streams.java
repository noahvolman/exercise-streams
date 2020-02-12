package nl.han.ica.oose.dea;


import nl.han.ica.oose.dea.helpers.Product;
import nl.han.ica.oose.dea.helpers.ProductCategory;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Streams {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        var result = input; // implement

        return result.stream().filter(string -> string.length()<3).collect(Collectors.toList());
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
        var result = input; // implement

        return result.stream().filter(string -> string.matches("[\\d]+")).collect(Collectors.toList());
    }

    String findShortestString(List<String> input) {
        return input.stream().sorted().findFirst().orElse("");
    }

    String createAFullSentenceFromTheList(List<String> input) {
        return input.stream().collect(Collectors.joining(" "));
    }

    int calculateTotalCostOfAllProducts(List<Product> products) {
        return products.stream().map(product -> product.getPrice())
                .reduce((prev, next) -> prev+next).orElse(0);
    }

    int calculateTotalCostOfAllGadgets(List<Product> products) {
        return products.stream().filter(product -> product.getCategory()== ProductCategory.GADGETS)
                .map(product -> product.getPrice())
                .mapToInt(Integer::intValue).sum();
    }
}
