package second.collections;

import java.util.List;
import java.util.Optional;

public class PickSingleElement {
    public static void main(String[] args) {
        final List<String> friends = List.of("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        final Optional<String> foundName = friends.stream().filter(name -> name.startsWith("N")).findFirst();
        System.out.printf("A name starting with N: %s", foundName.orElse("No name found"));
        System.out.println(foundName.orElse("llalala"));

    }
}
