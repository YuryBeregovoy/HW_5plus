import java.io.*;
import java.util.*;

public class HW5plus_1 {
    public static void main(String[] args) throws IOException {

//        Даны 2 файла - INPUT_1 и INPUT_2 в каждом файле по 1000 чисел от 1 до 100000.
//        Создайте файл OUTPUT, который будет содержать все отсортированные числа
//        из файлов.  Файлы in1.txt и in2.txt можно создать с помощью кода.


//        Создание файлов in1.txt и in2.txt способом 1
//        (через создание массивов) (3,443сек):

        int[] newArray1 = createArray(1000);
        int[] newArray2 = createArray(1000);
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("src/in1.txt"));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("src/in2.txt"));
        for (int e1 : newArray1) {
            bw1.write(e1 + "\n");
        }
        for (int e2 : newArray2) {
            bw2.write(e2 + "\n");
        }
        bw1.close();
        bw2.close();


//        Создание файлов способом 2, с построчной записью напрямую в файл
//        (естественно, выходит чуточку быстрее: 2,872сек):

//        int n = 1000;
//        int number;
//        BufferedWriter bw1 = new BufferedWriter(new FileWriter("src/in1.txt"));
//        BufferedWriter bw2 = new BufferedWriter(new FileWriter("src/in2.txt"));
//        Random RANDOM = new Random();
//        while (n > 0) {
//            number = RANDOM.nextInt(1, 100000);
//            n--;
//            bw1.write(number + "\n");
//            bw2.write(number + "\n");
//
//        }
//        bw1.close();
//        bw2.close();

        String first;
        String second;

        BufferedReader firstBr = new BufferedReader(new FileReader("src/in1.txt"));
        BufferedReader secondBr = new BufferedReader(new FileReader("src/in2.txt"));
        BufferedWriter outputBw = new BufferedWriter(new FileWriter("src/output.txt"));

        ArrayList<Integer> strings = new ArrayList<Integer>();

        while ((first = firstBr.readLine()) != null) {
            strings.add(Integer.valueOf(first));
        }
        firstBr.close();

        while ((second = secondBr.readLine()) != null) {
            strings.add(Integer.valueOf(second));
        }
        secondBr.close();


        Collections.sort(strings);


        for(Integer e: strings) {
            outputBw.write(e + System.lineSeparator());
        }
        outputBw.close();
    }


    private static int[] createArray(int count) {
        Random RANDOM = new Random();
        int[] intArray = new int[count];
        for (int i = 0; i < count; i++) {
            intArray[i] = RANDOM.nextInt(1, 100000);
        }
        return intArray;

    }
}







