import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] arr = new String[5];
        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), "\n");
            arr[i] = st.nextToken();

            if (maxLength < arr[i].length()) {
                maxLength = arr[i].length();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            for (String s : arr) {
                if (i < s.length())
                    sb.append(s.charAt(i));
                }
        }

        System.out.println(sb);

        br.close();
    }
}