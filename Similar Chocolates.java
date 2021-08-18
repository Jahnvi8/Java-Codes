// Problem
// There are  chocolates denoted by array  where  is the length of the -th chocolate. Alice can melt each chocolate and then convert it into a chocolate whose length is any divisor of the number . So, a chocolate of length  can be converted into  different types of chocolate where  is the count of divisors of the number . So you need to count the total unordered pair of chocolates such that their  value is same.

// Input Format
// The first line contains an integer  as input denoting the total number of elements in the array .
// The next line contains  space-separated integers that denote the elements of the array .

// Output Format
// In the output, print the total number of ways as mentioned in the statement.

// Constraints

// Sample Input
// 3
// 2 3 4
// Sample Output
// 1
// Time Limit: 1
// Memory Limit: 256
// Source Limit:
// Explanation
// There is only one possible value i.e. to pick the chocolates  and  as both of them have  divisors hence their  value is same.
____________________________________________________________________________________________________________________________________________________
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

       int[] pre=new int[(int)Math.pow(10,6)+1];
       int len=(int)Math.pow(10,6);
       
       for(int i=2 ; i<=len ; i++) {
        for(int j=2 ; j<=(len/i) ; j++) {
             pre[i*j]++ ;
            }
         }

        HashMap<Integer,Integer> hm=new HashMap<>();
        int n = s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
         for(int i=0;i<n;i++){
            hm.put(pre[ar[i]],hm.getOrDefault(pre[ar[i]],0)+1);
         }
         int ans=0;
          for (Map.Entry mapElement : hm.entrySet()) {
            int value = ((int)mapElement.getValue());
            ans+=((value*(value-1))/2);
        }
        System.out.println(ans);
}
 }

