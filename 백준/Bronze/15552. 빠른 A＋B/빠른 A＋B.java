import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        
        InputStream in = System.in;
	    InputStreamReader reader = new InputStreamReader(in);
	    BufferedReader br = new BufferedReader(reader);
	    OutputStream out = System.out;
	    OutputStreamWriter writer = new OutputStreamWriter(out);
	    BufferedWriter bw = new BufferedWriter(writer);
	   	    
	    int T = Integer.parseInt(br.readLine());	
	    int A;
	    int B;
	    int[] Arr = new int[T];
	    int count = 0;
	    
	    while(count < T) {
	    	String str = br.readLine();
	    	StringTokenizer st = new StringTokenizer(str);
	    	
	    	A = Integer.parseInt(st.nextToken());
	    	B = Integer.parseInt(st.nextToken());
	    	
	    	Arr[count] = A + B;
	    	count++;
	    }
	    
	    for(int i = 0; i < T; i++) {
	    	bw.write(Arr[i] + "\n");
	    }

    	bw.flush();
    	bw.close();
    	br.close();
        
    }
}