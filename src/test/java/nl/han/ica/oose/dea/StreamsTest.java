package nl.han.ica.oose.dea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;


class StreamsTest {
    private Streams streams;

    @BeforeEach
    void setup() {
        streams = new Streams();
    }

    @Test
    void testRemoveStringsWithMoreThanThreeCharacters() {
        // Setup
        List<String> input = asList("Welcome", "to", "Java", "8", "Streams");

        // Test
        List<String> filteredStrings = streams.filterStringsLongerThanThreeCharacters(input);

        // Verify
        assertThat(filteredStrings, contains("to", "8"));
    }

    @Test
    void testRemoveNonNumeralStrings() {
        // Setup
        List<String> input = asList("Welcome", "to", "Java", "8", "Streams");

        // Test
        List<String> filteredStrings = streams.filterStringsThanContainOnlyNumerals(input);

        // Verify
        assertThat(filteredStrings, contains("8"));
    }

    @Test
    void testFindShortestString() {
        // Setup
        List<String> input = asList("Welcome", "to", "Java", "8", "Streams");

        // Test
        String foundString = streams.findShortestString(input);

        // Verify
        Assertions.assertEquals("8", foundString);
    }

    @Test
    void testCreateAFullSentenceFromTheList() {
        // Setup
        List<String> input = asList("Welcome", "to", "Java", "8", "Streams");

        // Test
        String foundString = streams.createAFullSentenceFromTheList(input);

        // Verify
        Assertions.assertEquals("Welcome to Java 8 Streams", foundString);
    }
}
