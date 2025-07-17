package org.example.stackframe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.StackWalker.Option;
import java.lang.StackWalker.StackFrame;
import java.lang.management.ManagementFactory;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.function.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StackFrameTest {

    @DisplayName("properties 까보기")
    @Test
    void whatIsProperties() throws IOException {
        final FileReader fileReader = new FileReader("src/test/resources/myData.properties");

        final Properties properties = new Properties();
        properties.load(fileReader);

        System.out.println(properties.get("id"));
        System.out.println(properties.get("password"));
    }

    @DisplayName("asd")
    @Test
    void asd() {
        System.out.println(ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().toString());
    }
}
