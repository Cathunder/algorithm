import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int[] sorting = {a, b, c};
            Arrays.sort(sorting);

            if (Math.pow(sorting[0], 2) + Math.pow(sorting[1], 2) == Math.pow(sorting[2], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

        br.close();
    }
}