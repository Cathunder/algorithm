import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        int idx = N - 1;
        while (idx >= 0) {
            while (K - arr[idx] >= 0) {
                K -= arr[idx];
                cnt++;
            }
            idx--;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}