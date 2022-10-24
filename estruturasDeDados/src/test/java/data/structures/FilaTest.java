package data.structures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FilaTest {


    @ParameterizedTest()
    @MethodSource("isFullArguments")
    public void isFullDeveRetornarConformeParametros(int size, int[] elements, boolean isFullExpectedResult) {

        Fila<Integer> fila = new FilaImpl<>(size);

        for (int i : elements) {
            fila.enqueue(i);
        }

        org.assertj.core.api.Assertions.assertThat(fila.isFull()).isEqualTo(isFullExpectedResult);
    }

    static Stream<Arguments> isFullArguments() {
        int elementOne = random();
        int elementTwo = random();

        return Stream.of(
                arguments(2, new int[] { elementOne, elementTwo }, true),
                arguments(2, new int[] { elementOne }, false)
        );
    }

    private static int random() {
        return new Random().nextInt();
    }
}
