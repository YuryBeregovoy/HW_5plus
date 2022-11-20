import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class HW5plus_2 {

//    Дан файл  INPUT. Прочитать файл по строкам.
//    Подсчитать количество символов 'a' в файле.
//    Заменить содержимое файла на число символов 'a'.

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("src/input.txt"));
        System.out.println(lines);

        int count = 0;

        for (String word : lines) {
            for (char c : word.toCharArray()) {
                if (c == 'a') {
                    count++;
                }
            }
        }
        System.out.println(count);

        BufferedWriter outputBw = new BufferedWriter(new FileWriter("src/input.txt"));
        outputBw.write(Integer.toString(count));

        outputBw.close();

    }
}







