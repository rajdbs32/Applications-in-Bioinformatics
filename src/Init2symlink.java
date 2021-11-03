import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Init2symlink {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\1,1M.txt";

        File file = new File(filePath);
        System.out.println(file.length());
        long start = System.currentTimeMillis();
        Files.lines(Paths.get(filePath)).filter(str -> str.contains("gmail")).forEach(System.out::println);

    }

    }

}
