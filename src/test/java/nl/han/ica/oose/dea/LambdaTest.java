package nl.han.ica.oose.dea;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class LambdaTest {

    @Test
    void removeStringsWithMoreThanThreeCharacters() {
        List<String> input = asList("This", "is", "java", "8");
        //input = Lambda.filter(input, s -> s.length()<3);
        assertThat(input, contains("is", "8"));
    }

    @Test
    void shouldBeExecutedWitingATransaction() {
        TransactionLambda lambda = new TransactionLambda();
        //Lambda.processWithinTransaction(lambda);
        assertTrue(lambda.isConsumed());
    }

    @Test
    public void shouldCreateAString() {
        String bigString = Lambda.create();
        assertTrue(bigString.length() > 0);
    }

    @Test
    void extractStringSize() {
        String myString = "This is great";
        int length = Lambda.getStringLength(myString/* get string length*/);
        assertEquals(13, length);
    }

    @Test
    void multiply() {
        int a = 5;
        int b = 6;
        int result = Lambda.multiply(a, b);
        assertEquals(30, result);
    }

    @Test
    void shouldSortStrings() throws Exception {
        List<String> input = Arrays.asList("C", "F", "A", "D", "B", "E");
        List<String> result = Lambda.sortStrings(input);
        assertThat(result, is(equalTo(Arrays.asList("A", "B", "C", "D", "E", "F"))));
    }
}
