import java.io.File;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world!");
        System.out.println(2+2*2);

        var configFile=new File("build.gradle");
        System.out.println(configFile.exists());
        System.out.println(configFile.getAbsolutePath());
    }
}
