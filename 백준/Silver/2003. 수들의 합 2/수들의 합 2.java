import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int sum = 0;
        int p1 = 0;

        for (int p2 = 0; p2 < N; p2++) {
            sum += arr[p2];

            while (sum > M) {
                sum -= arr[p1];
                p1++;
            }

            if (sum == M) {
                cnt++;
            }
        }

        System.out.println(cnt);
        br.close();
    }
}