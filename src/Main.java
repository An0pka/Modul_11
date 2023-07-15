import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String>names = new ArrayList<>();
    static {
        names.add("serjio");
        names.add("bob");
        names.add("jerry");
        names.add("tom");
        names.add("spike");
        names.add("chip");
        names.add("daile");
        names.add("grigoriy");
        names.add("j0pka");
    }
    public List<String> kek (List<String> list){
        List <String> noviyList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i % 2 != 0){
                noviyList.add(i + ". " + list.get(i));
            }
        }return noviyList;

    }
    public static void main(String[] args){
        Main main = new Main();

        System.out.println(main.kek(names));

    }
}