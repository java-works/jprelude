package jprelude.core.io;


import java.io.IOException;

import jprelude.core.util.Seq;
import org.junit.Test;

public class TextWriterTest {
    @Test
    public void testWritingToStdOut() throws IOException {
        final Seq<String> seq = Seq.range(1, 11).map(n -> "Line " + n);
        final TextWriter textWriter = TextWriter.fromOutputStream(System.out);
        textWriter.writeSeq(seq);
    }
}
