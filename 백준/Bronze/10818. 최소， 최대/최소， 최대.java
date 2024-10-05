import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int N = Integer.parseInt(br.readLine());
	    
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    
	    int[] arr = new int[N];
	    for(int i = 0; i < N; i++) {
	    	arr[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    int min = arr[0];
	    int max = arr[0];
	    
	    for(int i = 0; i < N; i++) {
	    	if(min > arr[i]) min = arr[i];
	    	if(max < arr[i]) max = arr[i];
	    }
	    
	    bw.write(min + " " + max + "\n");

    	bw.flush();
    	bw.close();
    	br.close();
    }
}