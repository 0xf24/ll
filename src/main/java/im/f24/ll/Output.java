package im.f24.ll;

import java.util.Date;

public interface Output {
    void log(Level level, Date date, Name name, String msg);
}
