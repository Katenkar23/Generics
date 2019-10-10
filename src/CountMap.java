import java.util.Map;

public interface CountMap<K, Integer> {

    // добавляет элемент в этот контейнер
    void add(K key);

    // возвращает количество добавлений данного элемента
    int getCount(K key);

    // удаляет элемент из контейнера и возвращает количество его добавлений (до удаления)
    int remove(K key);

    // количество разных элементов
    int size();

    // добавить все элементы из source в текущий контейнер, при совпадении ключей суммировать значения
    void addAll(CountMap<K, Integer> m2);

    // вернуть java.util.Map.ключ - добавленный элемент, значение - количество его добавлений
    // <key, count>
    Map toMap();

    // тот же самый контракт, как и toMap(), только всю информацию записать в destination
    void toMap(Map destination); //<key, count>
}