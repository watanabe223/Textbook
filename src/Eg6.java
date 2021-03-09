import java.util.Scanner;

public class Eg6 {
    public static void main(String[] args) {
        try {
            String teachers[] = {"张三，李四，王五"};
            for (int i = 0; i < teachers.length; i++) {
                System.out.println(teachers[i]);
            }
            int applesNum = 0;
            int stuNum = 0;
            System.out.println("we are going to devide the apples to the children:");
            Scanner in = new Scanner(System.in);
            System.out.println("Please,input the number of apples:");
            applesNum = in.nextInt();
            System.out.println("please input the the number of students:");
            stuNum = in.nextInt();
            System.out.println("every student can get" + applesNum / stuNum + "apples");
            System.out.println("the children are very happy!");
        }catch(Exception e){
            System.out.println("arrayOutOfTheBorad");
        }
        System.out.println("显示完毕");
    }
}
