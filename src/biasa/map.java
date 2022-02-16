package biasa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        //Pembuatan map
        Map<String, String> masyarakat = new HashMap<>();
        masyarakat.put("001", "Ishak");
        masyarakat.put("002", "Rizki");
        masyarakat.put("003", "Dono");
        System.out.println(masyarakat.get("001"));
        System.out.println("\n---------------------\n");

        Set<String> keys = masyarakat.keySet();

        //Mengeprint data menggunakan foreach
        for (String key : keys
             ) {
            System.out.println("Id masyarakat: " + key + ", Nama: " + masyarakat.get(key));
        }
    }
}
