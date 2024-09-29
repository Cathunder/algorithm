import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] cnt = new int[100001];
        int maxLength = 0;
        int p1 = 0;

        for (int p2 = 0; p2 < N; p2++) {
            cnt[arr[p2]]++;
            while (cnt[arr[p2]] > K) {
                cnt[arr[p1]]--;
                p1++;
            }

            maxLength = Math.max(maxLength, p2 - p1 + 1);
        }

        System.out.println(maxLength);
        br.close();
    }
}