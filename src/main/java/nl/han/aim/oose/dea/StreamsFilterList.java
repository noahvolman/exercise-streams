package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        return input.stream()
                .filter(s -> s.length() < 3)
                .collect(Collectors.toList());
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
        return input.stream()
                .filter(s -> s.chars().allMatch(Character::isDigit))
                .collect(Collectors.toList());
    }
}
