package nl.han.aim.oose.dea;

import java.util.Comparator;
import java.util.List;

public class StreamsFindShortestString {
    String findShortestString(List<String> input) {
        return input.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
    }
}
