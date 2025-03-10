package org.example.generic;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.collection.SimpleArrayList;
import org.example.collection.SimpleList;
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
}
