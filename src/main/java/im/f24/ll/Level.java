package im.f24.ll;

public enum Level {

    ERROR(4, "error"),
    WARN (3, "warn "),
    INFO (2, "info "),
    DEBUG(1, "debug"),
    TRACE(0, "trace")
    ;

    public final int value;
    public final String name;

    Level(int id, String name) {
        this.value = id;
        this.name = name;
    }
}
