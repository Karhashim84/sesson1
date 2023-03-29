package lesson2.task;

import java.io.FileWriter;
import java.io.IOException;

//Напиши метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// котоый запишет эту сроку в простой текстовый файл, обработайте
public class task3 {
    private static String createTestString(String argument) {
        return String.valueOf(argument).repeat(100);
    }
    public static void write(String argument) {
        String str = createTestString(argument);
        try(FileWriter in = new FileWriter("test.txt")) {
            in.append(str);
            System.out.println("Recorded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
