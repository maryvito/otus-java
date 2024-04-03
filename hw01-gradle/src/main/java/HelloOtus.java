import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class HelloOtus {

    public static void main(String[] args) {
        Table<String, String, Integer> universityCourseSeatTable
                = HashBasedTable.create();
        System.out.println("Hello world!");
    }
}
