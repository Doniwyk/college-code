package practice_3;
import java.util.*;
public class DemoHasMap {
    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        hMapItem.put("1", "Biskuit");
        hMapItem.put("2", "Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);
        System.out.printf("HashMap Item Total : %d\n", hMapItem.size());

        Object mObject = hMapItem.remove("1");
        System.out.printf("%s remove from HashMap\n", mObject);
        System.out.printf("HashMap Item Total : %d\n", hMapItem.size());
        System.out.println(hMapItem);

        hMapItem.clear();
        System.out.printf("HashMap Item Total : %d\n", hMapItem.size());
    }
}
