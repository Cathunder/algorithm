import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        String[] arr = new String[cnt];
        for(int i = 0; i < cnt; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);
        Arrays.sort(arr, Comparator.comparingInt(String::length));

        for (int i = 0; i < arr.length - 1; i++) {
            if(!arr[i].equals(arr[i + 1])) {
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[arr.length - 1]);
    }
}