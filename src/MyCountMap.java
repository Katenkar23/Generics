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
    public int getCount(K key) {

        return map.get(key);
    }

    @Override
    public int remove(K key) {

        return 0;
    }

    @Override
    public int size() {

        return 0;
    }

    @Override
    public void addAll(CountMap<K, Integer> m2) {

    }

    @Override
    public Map toMap() {

        return map;
    }

    @Override
    public void toMap(Map destination) {

    }
}