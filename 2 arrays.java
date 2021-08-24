// Problem
// You are given  arrays  and , each of the size . Each element of these arrays is either a positive integer or . The total number of  that can appear over these  arrays are  and .

// Now, you need to find the number of ways in which we can replace each  with a non-negative integer, such that the sum of both of these arrays is equal.
 
// Input format

// First line: An integer 
// Second line:  space-separated integers, where the of these denotes 
// Third line:  space-separated integers, where the  of these denotes 
// Output format

// If there exists a finite number , then print it. If the answer is not a finite integer, then print 'Infinite'.

// Constraints



// The  may spread out among both arrays, and their quantity is between  and  (both inclusive)

// Sample Input 2

// 4
// 1 2 -1 4
// 3 3 -1 1
// Sample Output 2

// Infinite
// Sample Input
// 4
// 1 2 -1 4
// 3 3 3 1
// Sample Output
// 1
__________________________________________________________________________________________________________________________
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
        int n = s.nextInt();
        int suma=0,sumb=0,a=0,b=0;
        int ar1[]=new int[n];
        for(int i=0;i<n;i++)
        {ar1[i]=s.nextInt();
         if(ar1[i]>0)
           suma+=ar1[i];
           else 
           a++;
        }
         int ar2[]=new int[n];
         for(int i=0;i<n;i++)
        {ar2[i]=s.nextInt();
         if(ar2[i]>0)
           sumb+=ar2[i];
           else 
           b++;
        }

        if(a==1 && b==0)
        {
            if(suma<=sumb)
            System.out.println("1");
            else 
            System.out.println("0");
        }

        else if(a==0 && b==1)
        {
            if(suma>=sumb)
            System.out.println("1");
            else 
            System.out.println("0");
        }
        
        else if(a==2 && b==0)
        {
            if(suma<=sumb)
            System.out.println((sumb-suma)+1);
            else 
            System.out.println("0");
        }

         else if(a==0 && b==2)
        {
            if(suma>=sumb)
            System.out.println((suma-sumb)+1);
            else 
            System.out.println("0");
        }
        else
         System.out.println("Infinite");
        
        
     

    }
}
