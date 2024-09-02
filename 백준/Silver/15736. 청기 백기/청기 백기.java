import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int sqrtValue = (int)Math.sqrt(n);
        
        bw.write(String.valueOf(sqrtValue));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}