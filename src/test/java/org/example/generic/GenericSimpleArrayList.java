package org.example.generic;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.collection.SimpleArrayList;
import org.example.collection.SimpleList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GenericSimpleArrayList {

    @DisplayName("제네릭 심플 어레이 리스트 테스트")
    @Test
    void a() {
        SimpleList<Integer> values = new SimpleArrayList<>();
        values.add(1);
        values.add(2);

        assertThat(values.get(0)).isEqualTo(1);
        assertThat(values.get(1)).isEqualTo(2);
    }
}
