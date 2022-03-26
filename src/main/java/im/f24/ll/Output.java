package im.f24.ll;

import java.util.Date;
import java.util.function.Supplier;

@FunctionalInterface
public interface Output {
    void log(Level level, Date date, Name name, String msg);

    default void log(Level level, Date date, Name name, Supplier<String> msg) {
        log(level, date, name, msg.get());
    }
}
