import java.util.HashMap;
import java.util.Map;

public class MyCountMap<K, Integer> implements CountMap<K, Integer> {

    private final Map<K, java.lang.Integer> map;

    public MyCountMap(Map<K, java.lang.Integer> map) {

        this.map = map;
    }

    public MyCountMap() {

        this.map = new HashMap<>();
    }

    @Override
    public void add(K key) {

        if (map.containsKey(key))
            map.put(key, map.get(key) + 1);
        else
            map.put(key, 1);
    }

    @Override
    public int getCount(K key) {

        return map.get(key);
    }

    @Override
    public int remove(K key) {

        return map.remove(key);
    }

    @Override
    public int size() {

        return map.size();
    }

    @Override
    public void addAll(CountMap<K, Integer> m2) {

        map.putAll((Map<? extends K, ? extends java.lang.Integer>) m2);
    }

    @Override
    public Map toMap() {

        return map;
    }

    @Override
    public void toMap(Map destination) {

        destination.clear();
        destination.putAll(map);
    }

    public static void main(String[] args) {

    }
}
