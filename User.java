
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Collection;;

public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return username;
    }

    public void setPassword(String password) {
        this.username = password;
    }


    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // User user = new User();
        // System.out.print("Masukan username : ");
        // String username = input.nextLine();
        // user.setUsername(username);

        // System.out.print("Masukan password : ");
        // String password = input.nextLine();
        // user.setPassword(password);

        // if (user.getUsername().equalsIgnoreCase("admin") &&
        // user.getPassword().equalsIgnoreCase("123")) {
        // System.out.println("Login berhasil");
        // } else {
        // System.out.println("Login gagal");
        // }

        HashMap<String, String> days = new HashMap<String, String>();
        // mengisi hashmap
        days.put("senin", "Menghapal vocab");
        days.put("selasa", "Hapalan vocab");
        days.put("rabu", "Ada tes vocab");
        days.put("kamis", "Pengumuman nilai vocab");
        days.put("jumat", "Kecewa dengan pengumuman vocab");
        days.put("sabtu", "Dikasih vocab baru");
        days.put("minggu", "Aku suka vocab :)");
        days.remove("minggu");
        days.replace("jumat","Aku cinta PUB");

        Collection<String> values = days.values();
        System.out.println("nilai : " + values);

        if (days.isEmpty()) {
            System.out.println("hash map kosong");
        } else {
            
        }

        // cetak hashmap
        for (Map.Entry<String, String> x : days.entrySet()) {
            System.out.println(x.getKey() + " : " + x.getValue());
        }

        HashMap<String,String> cloneMap = (HashMap<String,String>) days.clone();

        for (Map.Entry<String, String> x : cloneMap.entrySet()) {
            System.out.println(x.getKey() + " : " + x.getValue());
        }

        SortedMap<String, String>  sortedMap = new TreeMap<>(days);

        for(Map.Entry<String, String>entry :sortedMap.entrySet()){
            System.out.println("Key : " +entry.getKey() + " Value : " +entry.getValue());
        }
    }
}