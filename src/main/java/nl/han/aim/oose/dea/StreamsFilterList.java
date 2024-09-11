package nl.han.aim.oose.dea;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        Stream <String> streamOfArray = input.stream()
                .filter(elements -> elements.length() < 3);


        return input;
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
        // TODO: implement

        return input;
    }
}
