import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int cnt = 0;
        int p1 = 0;
        int p2 = n - 1;

        while (p1 < p2) {
            int sum = arr[p1] + arr[p2];
            if(sum == target) {
                cnt++;
                p1++;
                p2--;
            } else if(sum < target) {
                p1++;
            } else {
                p2--;
            }
        }

        System.out.println(cnt);
        br.close();
    }
}