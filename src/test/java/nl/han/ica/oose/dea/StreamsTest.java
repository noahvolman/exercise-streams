package nl.han.ica.oose.dea;

import nl.han.ica.oose.dea.helpers.Product;
import nl.han.ica.oose.dea.helpers.ProductCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class StreamsTest {
    private Streams sut;

    @BeforeEach
    void setup() {
        sut = new Streams();
    }

    @Test
    void test1RemoveStringsWithMoreThanThreeCharacters() {
        // Setup
        List<String> input = asList("Welcome", "to", "Java", "8", "Streams");

        // Test
        List<String> filteredStrings = sut.filterStringsShorterThanThreeCharacters(input);

        // Verify
        assertThat(filteredStrings, contains("to", "8"));
    }

    @Test
    void test2RemoveNonNumeralStrings() {
        // Setup
        List<String> input = asList("Welcome", "to", "Java", "8", "Streams");

        // Test
        List<String> filteredStrings = sut.filterStringsThatContainOnlyNumerals(input);

        // Verify
        assertThat(filteredStrings, contains("8"));
    }

    @Test
    void test3AFindShortestString() {
        // Setup
        List<String> input = asList("Welcome", "to", "Java", "8", "Streams");

        // Test
        String foundString = sut.findShortestString(input);

        // Verify
        Assertions.assertEquals("8", foundString);
    }

    @Test
    void test3BFindShortestString() {
        // Setup
        List<String> input = asList(new String[]{});

        // Test
        String foundString = sut.findShortestString(input);

        // Verify
        Assertions.assertEquals("", foundString);
    }

    @Test
    void test4CreateAFullSentenceFromTheList() {
        // Setup
        List<String> input = asList("Welcome", "to", "Java", "8", "Streams");

        // Test
        String foundString = sut.createAFullSentenceFromTheList(input);

        // Verify
        Assertions.assertEquals("Welcome to Java 8 Streams", foundString);
    }

    @Test
    void test5ACalculateTotalCostOfAllProducts() {
        // Setup
        var input = initialiseTestProductSet();

        // Test
        int totalValue = sut.calculateTotalCostOfAllProducts(input);

        // Verify
        Assertions.assertEquals(7286, totalValue);
    }

    @Test
    void test6CalculateTotalCostOfAllGadgets() {
        // Setup
        var input = initialiseTestProductSet();

        // Test
        int totalValue = sut.calculateTotalCostOfAllGadgets(input);

        // Verify
        Assertions.assertEquals(3886, totalValue);
    }

    private List<Product> initialiseTestProductSet() {
        List<Product> input;

        final int PRICE_TV = 1200;
        final int PRICE_LAPTOP = 2300;
        final int PRICE_TABLET = 149;
        final int PRICE_PHONE = 237;
        final int PRICE_TABLE = 3400;

        var tv = new Product("TV", PRICE_TV);
        var laptop = new Product("Laptop", PRICE_LAPTOP);
        var tablet = new Product("tablet", PRICE_TABLET);
        var phone = new Product("phone", PRICE_PHONE);
        var table = new Product("table", PRICE_TABLE, ProductCategory.FURNITURE);

        return asList(tv, laptop, tablet, phone, table);
    }
}
