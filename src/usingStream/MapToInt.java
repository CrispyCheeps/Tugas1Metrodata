package usingStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToInt {
    public static void main(String[] args) {
        //Deklarasi list angka
        List<String> angka = Arrays.asList("1", "2", "3", "4", "5");

        //MapToInt menggunakan filtering
        angka.stream().mapToInt(num ->Integer.parseInt(num))
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}
