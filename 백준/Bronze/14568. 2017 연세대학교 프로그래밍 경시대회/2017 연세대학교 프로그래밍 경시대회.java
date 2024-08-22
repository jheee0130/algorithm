import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());        
        int answer = 0;
        
        for(int a=1; a<n; a++){
            for(int b=1; b<n; b++){
                for(int c=1; c<n; c++){
                    if(a+b+c == n && a >= b+2 && c%2 == 0){
                        answer++;
                    }
                }
            }
        }
        
        bw.write(answer + "");
        
        bw.flush();
        bw.close();
    }
}