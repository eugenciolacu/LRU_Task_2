public class Main {

    public static void main(String[] args) {
        LRU lru= new LRU();
        System.out.println("Print LRU after creating it");
        lru.printLruCash();

        lru.accessFirst10Elements();
        System.out.println("\nPrint LRU after accessing first 10 elements");
        lru.printLruCash();

        System.out.println("\nAdd 10 new users ");
        lru.addNew10Users();
        lru.printLruCash();
    }
}
