import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < cnt; i++) {
            set.add(br.readLine());
        }

        List<String> words = new ArrayList<>(set);
        words.stream()
            .sorted(Comparator.comparingInt(String::length).thenComparing((String::compareTo)))
            .forEach(System.out::println);
    }
}