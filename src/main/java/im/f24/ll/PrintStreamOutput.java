package im.f24.ll;

import java.io.PrintStream;
import java.util.Date;

public class PrintStreamOutput implements Output {

    private final PrintStream stream;
    private final String format;

    public PrintStreamOutput(PrintStream stream, String format) {
        this.stream = stream;
        this.format = format;
    }

    public PrintStreamOutput(PrintStream stream) {
        this(stream, "[%1$tF %<tT.%<tL][%2$s][%3$s] %4$s%n");
    }

    @Override
    public void log(Level level, Date date, Name name, String msg) {
        stream.printf(format, date, level.name, name, msg);
    }
}
