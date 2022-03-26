package im.f24.ll;

import java.util.Arrays;
import java.util.Iterator;

public final class Name implements Iterable<String> {
    private final String[] names;

    public Name(String name) {
        this.names = new String[] { name };
    }

    private Name(String[] names) {
        this.names = names;
    }

    public Name child(String name) {
        String[] new_names = Arrays.copyOf(names, names.length + 1);
        new_names[new_names.length - 1] = name;
        return new Name(new_names);
    }

    @Override
    public Iterator<String> iterator() {
        return Arrays.stream(names).iterator();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
            builder.append(names[i]);
            if (i < names.length - 1) builder.append(".");
        }

        return builder.toString();
    }
}
