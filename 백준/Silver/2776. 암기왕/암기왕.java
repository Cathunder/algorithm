import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int cnt1 = Integer.parseInt(br.readLine());
            int[] note1 = new int[cnt1];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < cnt1; j++) {
                note1[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(note1);

            int cnt2 = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for (int k = 0; k < cnt2; k++) {
                sb.append(binarySearch(Integer.parseInt(st.nextToken()), note1)).append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }

    public static int binarySearch(int num, int[] note1) {
        int left = 0;
        int right = note1.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (note1[mid] == num) {
                return 1;
            }

            if (note1[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0;
    }
}