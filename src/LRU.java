import java.util.Map;

public class LRU {
    final static int maxCapacity=50;
    Map<Integer, String> lruCash = new LRUmap<>(maxCapacity);

    public LRU() {
        fillChash();
    }

    public void fillChash(){
        int i=0;
        while (lruCash.size()<maxCapacity) {
            lruCash.put(i, "User" + i++);
        }
    }

    public void printLruCash(){
        int i = 0;
        for(Map.Entry<Integer, String> pair: lruCash.entrySet()){
            pair.getKey();
            pair.getValue();
            System.out.println(++i + "\t " + pair.getKey() + "\t " + pair.getValue() );
        }
    }

    public void accessFirst10Elements(){
        for (int i = 0; i < 10; i++){
            lruCash.get(i);
        }
    }

    public void addNew10Users(){
        for(int i = 0; i < 10; i++)
            lruCash.put(maxCapacity + i, "NewUser" + i);
    }
}
