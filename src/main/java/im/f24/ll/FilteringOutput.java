package im.f24.ll;

import java.util.Date;

public abstract class FilteringOutput implements Output {

    private Level level = Level.TRACE;

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public void log(Level level, Date date, Name name, String msg) {
        if (level.value < this.level.value) return;
        filteredLog(level, date, name, msg);
    }

    protected abstract void filteredLog(Level level, Date date, Name name, String msg);
}
