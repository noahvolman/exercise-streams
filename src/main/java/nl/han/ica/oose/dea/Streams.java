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


    public String createAFullSentenceFromTheList(List<String> input) {
        var fullSentence = input.stream().reduce((s1, s2) -> s1 + " " + s2);

        return fullSentence.orElse("");
    }
}
