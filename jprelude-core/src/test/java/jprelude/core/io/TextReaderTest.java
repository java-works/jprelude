package jprelude.core.io;


import java.nio.file.Paths;
import org.junit.Test;

public class TextReaderTest {
    @Test
    public void testSomething() {
        TextReader.fromFile(Paths.get("./src/test/java/jprelude/core/io/TextReaderTest.java"))
                .readSeq()
                .toStringList()
                .forEach(System.out::println);
    }
}
