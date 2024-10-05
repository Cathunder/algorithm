import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        br.close();

        System.out.println(compress(0, 0, N));
    }

    static String compress(int x, int y, int size) {
        if (isSame(x, y, size)) {
            return String.valueOf(arr[x][y]);
        }

        int half = size / 2;
        String upperLeft = compress(x, y, half);
        String upperRight = compress(x, y + half, half);
        String lowerLeft = compress(x + half, y, half);
        String lowerRight = compress(x + half, y + half, half);

        return "(" + upperLeft + upperRight + lowerLeft + lowerRight + ")";
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