package usingStream;

import java.util.ArrayList;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        //Deklarasi arraylist angka
        ArrayList<Integer> angka = new ArrayList<Integer>();
        angka.add(1);
        angka.add(12);
        angka.add(7);
        angka.add(4);

        //Mengeprint output menggunakan method stream.sorted()
        System.out.println("sorted stream : ");
        angka.stream().sorted().forEach(System.out::println);
    }
}
