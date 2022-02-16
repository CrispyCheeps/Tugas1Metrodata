package usingStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class map {
    public static void main(String[] args) {
        //Deklarasi dan input data map
        Map<String, String> buku = new HashMap<>();
        buku.put("001", "buku fundamental java");
        buku.put("002", "buku fundamental python");
        buku.put("003", "buku fundamental web");

        //Pengaplikasian stream filtering yang cocok dengan judul
        // "Buku fundamental java"
        Optional<String> idBuku = buku.entrySet().stream()
                .filter(e -> "buku fundamental java".equals(e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

        if("001" == idBuku.get()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }



}
