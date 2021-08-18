// Problem
// There are three planes ,  and . Plane  will takeoff on every  day i.e. , ,  and so on. Plane  will takeoff on every  day and plane  will takeoff on every  day. There is only one runway and the takeoff timing is same for each of the three planes on each day. Your task is to find out the maximum number of flights that will successfully takeoff in the period of  days.

// Note: If there is collision between the flights no flight will take off on that day.

// Input Format
// The first line of the input contains a single integer , the number of test cases.
// Then  lines follow each containing four space-separated integers , ,  and  as denoted in the statement.

// Output Format
// For each test case print a single integer representing the maximum number of flights that will successfully takeoff in the period of  days.

// Constraints

// Sample Input
// 2
// 10 2 3 4
// 10 2 2 4
// Sample Output
// 4
// 0
// Time Limit: 1
// Memory Limit: 256
// Source Limit:
// Explanation
// Sample test case :
// Note that on days  and  plane  can takeoff, on days  and  plane  can takeoff.

// Sample test case :
// Note that there is no day on which there is no collision.
__________________________________________________________________________________________________________________________________________________________
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;
import java.util.StringTokenizer;
 
 class TestClass  {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(
                new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0,
                                 BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
 
    public static void main(String args[] ) throws Exception {
      
        Reader s = new Reader();
        int t = s.nextInt();
        while((t--)!=0){
        int n = s.nextInt();
        int p = s.nextInt();
        int q = s.nextInt();
        int r = s.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
       
        for(int i=1;i<=n;i++){
          if(i%p==0){
               hm.put(i, hm.getOrDefault(i, 0) + 1);
          }
          if(i%q==0){
               hm.put(i, hm.getOrDefault(i, 0) + 1);
          }
          if(i%r==0){
               hm.put(i, hm.getOrDefault(i, 0) + 1);
          }
           

        }
        int c=0;

        for (Map.Entry mapElement : hm.entrySet()) {
           
            int value = ((int)mapElement.getValue());
            if(value==1) c++;
           
        }

        System.out.println(c);
        }
       
        }

    
}
