package im.f24.ll;

import java.util.function.Supplier;

public interface LL {

    void log(Level level, String msg);

    void log(Level level, Supplier<String> msg);

    public LL child(String name);

    default void error(String msg) {
        log(Level.ERROR, msg);
    }

    default void error(Supplier<String> msg) {
        log(Level.ERROR, msg);
    }

    default void warn(String msg) {
        log(Level.WARN, msg);
    }

    default void warn(Supplier<String> msg) {
        log(Level.WARN, msg);
    }

    default void info(String msg) {
        log(Level.INFO, msg);
    }

    default void info(Supplier<String> msg) {
        log(Level.INFO, msg);
    }

    default void debug(String msg) {
        log(Level.DEBUG, msg);
    }

    default void debug(Supplier<String> msg) {
        log(Level.DEBUG, msg);
    }

    default void trace(String msg) {
        log(Level.TRACE, msg);
    }

    default void trace(Supplier<String> msg) {
        log(Level.TRACE, msg);
    }
}
