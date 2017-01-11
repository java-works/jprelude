package jprelude.csv.base;

import java.util.Arrays;
import jprelude.core.io.TextWriter;
import jprelude.core.util.Seq;
import org.junit.Test;

public class CsvExporterTest {
    @Test
    public void someTest() {
        final Seq<Integer> seq = Seq.range(1, 11);
        
        CsvFormat csvFormat = CsvFormat.builder()
                .delimiter(',')
                .columns("Alpha", "Beta", "Gamma")
                .build();
        
        CsvExporter<Integer> csvExporter = CsvExporter.<Integer>builder()
                .format(csvFormat)
                .mapper(n -> Arrays.asList("A" + n, "B" + n, "C" + n))
                .build();
        
        csvExporter.export(seq, TextWriter.fromOutputStream(System.out));
    }
}
