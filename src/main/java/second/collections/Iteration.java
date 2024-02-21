package second.collections;

import java.util.List;

public class Iteration {
    public static void main(String[] args) {
        final List<String> friends = List.of("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        for(int i =0; i < friends.size(); i++){
            System.out.println(friends.get(i));
        }
        for(String friend: friends){
            System.out.println(friend);
        }
        friends.forEach(System.out::println);
    }
}
