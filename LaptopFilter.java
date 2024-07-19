import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LaptopFilter {
    public static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, Object> criteria) {
        return laptops.stream()
                .filter(laptop -> criteria.entrySet().stream()
                        .allMatch(entry -> {
                            switch (entry.getKey()) {
                                case "ram":
                                    return laptop.getRam() >= (int) entry.getValue();
                                case "storage":
                                    return laptop.getStorage() >= (int) entry.getValue();
                                case "os":
                                    return laptop.getOs().equalsIgnoreCase((String) entry.getValue());
                                case "color":
                                    return laptop.getColor().equalsIgnoreCase((String) entry.getValue());
                                default:
                                    return false;
                            }
                        }))
                .collect(Collectors.toSet());
    }

    public static void printLaptops(Set<Laptop> laptops) {
        if (laptops.isEmpty()) {
            System.out.println("Ноутбуков, соответствующих критериям, не найдено.");
        } else {
            laptops.forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();
        Map<String, Object> criteria = FilterCriteria.getFilterCriteria();
        Set<Laptop> filteredLaptops = filterLaptops(store.getLaptops(), criteria);
        printLaptops(filteredLaptops);
    }
1
}
