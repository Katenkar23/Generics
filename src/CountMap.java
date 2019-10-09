import java.util.Map;

public interface CountMap<K, Integer> {
    void add(K key);

    void addAll(CountMap<K, Integer> m2);

    int count(K key);

    //<key, count>
    Map asMap();

    void copyTo(Map map); //<key, count>
}