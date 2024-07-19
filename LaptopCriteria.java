import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FilterCriteria {
    public static Map<String, Object> getFilterCriteria() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> criteria = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int criterion = scanner.nextInt();
        scanner.nextLine();  // consume the newline

        switch (criterion) {
            case 1:
                System.out.print("Введите минимальный объем ОЗУ (в ГБ): ");
                int ram = scanner.nextInt();
                criteria.put("ram", ram);
                break;
            case 2:
                System.out.print("Введите минимальный объем ЖД (в ГБ): ");
                int storage = scanner.nextInt();
                criteria.put("storage", storage);
                break;
            case 3:
                System.out.print("Введите операционную систему: ");
                String os = scanner.nextLine();
                criteria.put("os", os);
                break;
            case 4:
                System.out.print("Введите цвет: ");
                String color = scanner.nextLine();
                criteria.put("color", color);
                break;
            default:
                System.out.println("Некорректный выбор.");
        }

        return criteria;
    }
}
