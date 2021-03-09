import java.util.*;

public class CountChariter {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        String string = "this is a test,and that is also a test!";
        String str[] = string.split(",|\\s|!");

        //对上式数组进行循环，把每个单词添加到map中
        for (String s : str) {
            /*
            s:key
            若取到的值是null，说明该单词从未被统计过，则把1作为value put进去
            若取到的值不是null,则说明该单词已经被统计过，则把之前的value拿出来+1
             */

            //Integer是int类的包装类：主要用于装箱和拆箱、数据类型转换
            if (s.length() != 0) {
                Integer count = map.get(s);
                if (count == null) {
                    map.put(s, 1);
                } else {
                    count++;
                    map.put(s, count);
                }
            }
        }
        Set<String> set = map.keySet();

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String word = iter.next();
            System.out.println(word + ":" + map.get(word));
        }
    }
}
