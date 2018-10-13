import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    public List getPermutations(String input) {

        List strList = new ArrayList<>();
        permutations("", input, strList);
        return strList;
    }

    public void permutations(String consChars, String input, List list) {

        if(input.isEmpty()) {
            list.add(consChars + input);
            return;
        }

        for(int i = 0; i < input.length(); i++) {
            permutations(consChars + input.charAt(i),
                    input.substring(0, i)+input.substring(i+1), list);
        }
    }

    public static void main(String a[]) {
        StringPermutations permutations = new StringPermutations();
        List output = permutations.getPermutations("ab");
        System.out.println("Result size: "+output.size());
        output.stream().forEach(System.out::println);
    }


}