import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();

        partition(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    static void partition(int x, int y, int size) {
        int sum = 0;

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                sum += arr[i][j];
            }
        }

        if (sum == 0) {
            white++;
        } else if (sum == size * size) {
            blue++;
        } else {
            int half = size / 2;

            partition(x, y, half);
            partition(x, y + half, half);
            partition(x + half, y, half);
            partition(x + half, y + half, half);
        }
    }
}