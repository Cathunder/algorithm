import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int minus = 0;
    static int zero = 0;
    static int plus = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(plus);
    }

    static void partition(int x, int y, int size) {
        if (isSame(x, y, size)) {
            if (arr[x][y] == -1) {
                minus++;
            } else if (arr[x][y] == 0) {
                zero++;
            } else {
                plus++;
            }
            return;
        }

        int newSize = size / 3;

        partition(x, y, newSize);
        partition(x, y + newSize, newSize);
        partition(x, y + 2 * newSize, newSize);

        partition(x + newSize, y, newSize);
        partition(x + newSize, y + newSize, newSize);
        partition(x + newSize, y + 2 * newSize, newSize);

        partition(x + 2 * newSize, y, newSize);
        partition(x + 2 * newSize, y + newSize, newSize);
        partition(x + 2 * newSize, y + 2 * newSize, newSize);
    }

    static boolean isSame(int x, int y, int size) {
        int value = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}