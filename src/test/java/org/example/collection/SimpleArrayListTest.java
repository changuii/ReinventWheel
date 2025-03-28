package org.example.collection;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class SimpleArrayListTest {

    @DisplayName("심플 리스트 테스트")
    @Test
    void simpleList() {
        SimpleList values = new SimpleArrayList();
        values.add("first");
        values.add("second");

        assertThat(values.add("third")).isTrue();
        assertThat(values.size()).isEqualTo(3);
        assertThat(values.get(0)).isEqualTo("first");
        assertThat(values.contains("first")).isTrue();
        assertThat(values.remove(0)).isEqualTo("first");
        assertThat(values.size()).isEqualTo(2);

    }

    @DisplayName("a")
    @Test
    void a() {
        // given
        List<Integer> integers = Collections.emptyList();
        // when

        assertThat(integers.stream()
                .anyMatch(i -> i > 10)).isTrue();

        // then
    }

}
