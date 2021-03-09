import java.io.File;
import java.io.FileFilter;

public class TestListFile {
    public static void main(String[] args) {
        File file =new File("D:\\桌面\\蓝桥\\2021-03-02(视频)\\0302\\新建文件夹 (2)");
        System.out.println("使用list()方法获取String数组");
        //返回一个字符串数组，由文件名组成
        String[] fileNameList= file.list();
        for(String fileName:fileNameList){
            System.out.println(fileName);
        }
        System.out.println("使用listFiles()方法获取File数组");
        //返回一个File数组，由File实例组成
        File[] fileList = file.listFiles();
        for(File file01:fileList){
            System.out.println(file01.getName());
        }
        //使用匿名内部类创建过滤器，过滤出。java结尾的文件
        System.out.println("使用listFiles(filter)方法过滤出.java文件");
        File[] fileList01 = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().endsWith(".java"))
                    return true;
                return false;
            }
        });
        for(File f1:fileList01){
            System.out.println(f1.getName());
        }

    }
}
