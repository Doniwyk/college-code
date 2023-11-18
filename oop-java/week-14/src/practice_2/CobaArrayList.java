package practice_2;
import java.util.*;
public class CobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        System.out.println(mListCountry);
//        System.out.printf("List index 0 = %s\n", mListCountry.get(0));
//        System.out.printf("List index 2 = %s\n", mListCountry.get(2));
        System.out.println("Country List");
        Iterator mIterator = mListCountry.iterator();
        while (mIterator.hasNext()) {
            Object element = mIterator.next();
            System.out.printf("%s ", element);
        }
    }
}
