import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Caps {

    public List<String> sorted(List<String>name){
        List<String> newbie = name.stream().map(String::toUpperCase).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        return newbie;
    }

    public static void main(String[] args) {
        Caps caps = new Caps();
        System.out.println(caps.sorted(Main.names));
    }
}
