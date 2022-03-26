package im.f24.ll;


import java.util.Date;
import java.util.function.Supplier;

public class OutputLL implements LL, Output {

    private final Name name;
    private final Output[] outputs;

    public OutputLL(String name, Output ...outputs) {
        this.name = new Name(name);
        this.outputs = outputs;
    }

    public OutputLL(Name name, Output ...outputs) {
        this.name = name;
        this.outputs = outputs;
    }

    @Override
    public void log(Level level, String msg) {
        log(level, new Date(), name, msg);
    }

    @Override
    public void log(Level level, Supplier<String> msg) {
        log(level, new Date(), name, msg);
    }

    @Override
    public LL child(String name) {
        return new OutputLL(this.name.child(name), this);
    }

    @Override
    public void log(Level level, Date date, Name name, String msg) {
        for (Output output : outputs) {
            output.log(level, date, name, msg);
        }
    }

    @Override
    public void log(Level level, Date date, Name name, Supplier<String> msg) {
        for (Output output : outputs) {
            output.log(level, date, name, msg);
        }
    }
}
