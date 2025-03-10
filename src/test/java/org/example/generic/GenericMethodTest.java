package org.example.generic;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.collection.SimpleArrayList;
import org.example.collection.SimpleList;
import org.example.printer.LaserPrinter;
import org.example.printer.Printer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GenericMethodTest {

    @DisplayName("제네릭 메서드")
    @Test
    void a() {
        final String[] arrays = {"first", "second"};

        final SimpleArrayList<String> stringSimpleArrayList = SimpleList.<String>fromArrayToList(arrays);

        assertThat(stringSimpleArrayList.get(0)).isEqualTo("first");
        assertThat(stringSimpleArrayList.get(1)).isEqualTo("second");
        assertThat(stringSimpleArrayList.size()).isEqualTo(2);
    }

    @DisplayName("sum")
    @Test
    void sum() {
        final SimpleList<Double> doubleValues = new SimpleArrayList<>(0.5, 0.7);
        final SimpleList<Integer> intValues = new SimpleArrayList<>(1, 2);

        assertThat(SimpleList.sum(doubleValues)).isEqualTo(1.2);
        assertThat(SimpleList.sum(intValues)).isEqualTo(3);
    }

    @DisplayName("string sum")
    @Test
    void sums() {
        final SimpleArrayList<String> objectSimpleArrayList = new SimpleArrayList<>("asd", "asdsd");
        // note : 컴파일 에러 발생
//        SimpleList.sum(objectSimpleArrayList)
    }

    @DisplayName("filter ")
    @Test
    void filter() {
        final SimpleList<Double> doubleValues = new SimpleArrayList<>(-0.1, 0.5, 0.7);
        final SimpleList<Integer> intValues = new SimpleArrayList<>(-10, 1, 2);

        final SimpleList<Double> filteredDoubleValues = SimpleList.filterNegative(doubleValues);
        final SimpleList<Integer> filteredIntValues = SimpleList.filterNegative(intValues);

        assertThat(filteredDoubleValues.contains(-0.1)).isFalse();
        assertThat(filteredIntValues.contains(-10)).isFalse();
    }

    @DisplayName("copy")
    @Test
    void copy() {
        final var laserPrinter = new LaserPrinter();

        final SimpleList<Printer> printers = new SimpleArrayList<>();
        final SimpleList<LaserPrinter> laserPrinters = new SimpleArrayList<>(laserPrinter);

        SimpleList.copy(laserPrinters, printers);

        assertThat(printers.get(0) == laserPrinter).isTrue();
    }
}
