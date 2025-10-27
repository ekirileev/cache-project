public class CacheTest {
    public static void main(String[] args) {
        Cache<String> cache = new Cache<>(3);
        
        cache.add("Первый");
        cache.add("Второй");
        cache.add("Третий");
        
        System.out.println("После добавления 3 элементов:");
        System.out.println("Первый: " + cache.getFirst());
        System.out.println("Последний: " + cache.getLast());
        
        cache.add("Четвертый");
        System.out.println("\nПосле добавления четвертого:");
        System.out.println("Первый: " + cache.getFirst());
        System.out.println("Последний: " + cache.getLast());
        
        System.out.println("\nПоиск элементов:");
        System.out.println("Есть 'Второй': " + cache.exists("Второй"));
        System.out.println("Есть 'Первый': " + cache.exists("Первый"));
        
        System.out.println("\nУдаляем 'Второй': " + cache.remove("Второй"));
        System.out.println("Есть 'Второй' после удаления: " + cache.exists("Второй"));
        
        System.out.println("\nЭлементы по индексу:");
        System.out.println("Индекс 0: " + cache.getItemByIndex(0));
        System.out.println("Индекс 1: " + cache.getItemByIndex(1));
    }
}
