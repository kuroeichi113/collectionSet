import java.util.HashSet;
import java.util.Set;

public class LaptopStore {
    private Set<Laptop> laptops;

    public LaptopStore() {
        this.laptops = new HashSet<>();
        initializeLaptops();
    }

    private void initializeLaptops() {
        laptops.add(new Laptop("Dell", 16, 512, "Windows", "Black"));
        laptops.add(new Laptop("Apple", 8, 256, "macOS", "Silver"));
        laptops.add(new Laptop("HP", 32, 1024, "Windows", "Black"));
        laptops.add(new Laptop("Asus", 16, 256, "Windows", "White"));
        laptops.add(new Laptop("Lenovo", 8, 512, "Windows", "Gray"));

    }

    public Set<Laptop> getLaptops() {
        return laptops;
    }
}

