package im.f24.ll;

import java.io.PrintStream;
import java.util.Date;

public class ColorPrintStreamOutput implements Output {

    private final PrintStream stream;
    private static final String[] colors = new String[] {
        "",
        "",
        "",
        ANSI.YELLOW,
        ANSI.RED
    };


    public ColorPrintStreamOutput(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void log(Level level, Date date, Name name, String msg) {
        stream.printf(ANSI.BOLD + "%2$s[%1$tF %<tT.%<tL][%3$s][%4$s] %5$s" + ANSI.RESET + "%n", date, colors[level.value], level.name, name, msg);
    }

}
