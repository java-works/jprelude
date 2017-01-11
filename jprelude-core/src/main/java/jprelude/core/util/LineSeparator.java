package jprelude.core.util;

public enum LineSeparator {
    SYSTEM(System.lineSeparator()),
    LF("\n"),
    CR("\r"),
    CRLF("\r\n"),
    LFCR("\n\r"),
    NONE("");
    
    final String value;
    
    LineSeparator(final String value) {
        this.value = value;
    }

    public final String value() {
        return this.value;
    }
}
