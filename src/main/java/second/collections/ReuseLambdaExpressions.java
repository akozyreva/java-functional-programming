package second.collections;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReuseLambdaExpressions {
    public static void main(String[] args) {
        final List<String> friends = List.of("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        final List<String> comrades = List.of("Kate", "Ken", "Nick", "Paula", "Zach");
        final List<String> editors = List.of("Brian", "Jackie", "John", "Mike");
        // there's too duplicates
//        final long countFriendsStartN = friends.stream().filter(name -> name.startsWith("N")).count();
//        final long countComradesStartN = comrades.stream().filter(name -> name.startsWith("N")).count();
//        final long countEditorsStartN = editors.stream().filter(name -> name.startsWith("N")).count();
        // we can instead assign lambda to variable
        final Predicate<String> startWithN = name -> name.startsWith("N");
        final long countFriendsStartN = friends.stream().filter(startWithN).count();
        final long countComradesStartN = comrades.stream().filter(startWithN).count();
        final long countEditorsStartN = editors.stream().filter(startWithN).count();

        // example of using generic method:
        final long countEditorsStartR = editors.stream().filter(checkIfStartsWith("R")).count();

        friends.stream().filter(startsWithLetterFunction.apply("N"));

    }
    // if we would like to write generic method, it can be done with Lexical Scoping:
    public static Predicate<String> checkIfStartsWith(final String letter) {
        // it returns lambda function
        return name -> name.startsWith(letter);
    }

    // we can use more general interface Function
    static final Function<String, Predicate<String>> startsWithLetterFunction =
            letter -> name -> name.startsWith(letter);
}
