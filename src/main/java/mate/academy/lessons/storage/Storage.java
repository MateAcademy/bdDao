package mate.academy.lessons.storage;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class Storage<T, V> {

    private int size = 0;
    @SuppressWarnings({"rawtypes","unchecked"})
    private Entry<T,V>[] entries = (Entry<T, V>[]) new Entry[size];

    public void put(T key, V value) {
        if (entries.length == 0) {
            size++;
            entries = new Entry[size];
            Entry<T, V> entry = new Entry<>(key, value);
            entries[0] = entry;

        } else if (entries.length != 0) {
            Entry<T, V> entry = new Entry<>(key, value);
            size++;
            Entry[] nodas2 = Arrays.copyOf(entries, size);
            nodas2[size - 1] = entry;
            entries = nodas2;
        }
    }

    public Optional<V> get(T key) {
        for (Entry<T, V> t : entries) {
            if (key.equals(t.getKey())) {
                return Optional.of(t.getValve());
            }
        }
//throw new NoSuchElementException();
        return Optional.empty();
    }

    private class Entry<T, V> {
        T key;
        V valve;

        public Entry(T key, V valve) {
            this.key = key;
            this.valve = valve;
        }

        public T getKey() {
            return key;
        }

        public V getValve() {
            return valve;
        }

        @Override
        public String toString() {
            return "key= " + key + ", valve= " + valve;
        }
    }

    @Override
    public String toString() {
        return "Storage{" + Arrays.toString(entries) +
                '}';
    }
}
