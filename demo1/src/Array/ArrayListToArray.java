package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("1");
        strList.add("2");
        strList.add("3");

        String[] strArr = null;

        strArr = strList.toArray(new String[strList.size()]);
        System.out.println(Arrays.toString(strArr));
    }
}
//更多请阅读：https://www.yiibai.com/java/java-arraylist-to-array.html
