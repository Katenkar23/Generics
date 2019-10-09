import java.util.HashMap;
import java.util.Map;

public class MyCountMap<K> implements CountMap<K, Integer> {

    private final Map<K, Integer> map;

    public MyCountMap(Map<K, Integer> map) {

        this.map = map;
    }

    public MyCountMap() {

        this.map = new HashMap<K, Integer>();
    }

    @Override
    public void add(K key) {

        if (map.containsKey(key))
            map.put(key, (map.get(key) + 1));
        else
            map.put(key, 1);
    }

    @Override
    public void addAll(CountMap<K, Integer> m2) {

    }

/*
    @Override
    public void addAll(CountMap<K, Number> m2) {
        map.putAll(m2.asMap());
    }
*/

    @Override
    public int count(K key) {
        return map.get(key);
    }

    @Override
    public Map<K, Integer> asMap() {
        return map;
    }

    @Override
    public void copyTo(Map map) {

    }
}