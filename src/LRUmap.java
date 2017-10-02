import java.util.LinkedHashMap;
import java.util.Map;

public class LRUmap<K, V> extends LinkedHashMap<K, V> {
    private final Integer maxCapacity;

    public LRUmap(final Integer maxCapacity) {
        super(maxCapacity, 1, true);
        this.maxCapacity = maxCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.size() > maxCapacity;
    }
}
