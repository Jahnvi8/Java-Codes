// Problem
// Our friend Monk has an exam that has quite weird rules. Each question has a difficulty level in the form of an Integer. Now, Monk can only solve the problems that have difficulty level less than X . Now the rules are-

// Score of the student is equal to the maximum number of answers he/she has attempted without skipping a question.
// Student is allowed to skip just "one" question that will not be counted in the continuity of the questions.
// Note- Assume the student knows the solution to the problem he/she attempts and always starts the paper from first question.

// Given the number of Questions, N ,the maximum difficulty level of the problem Monk can solve , X ,and the difficulty level of each question ,  can you help him determine his maximum score?

// Input Format
// First Line contains Integer N , the number of questions and the maximum difficulty X Monk can solve.
// Next line contains N integers,  denoting the difficulty level of each question.

// Output Format
// Maximum score Monk can achieve in the exam.

// Constraints

// Sample Input
// 7 6
// 4 3 7 6 7 2 2
// Sample Output
// 3
_____________________________________________________________________________________________________________________
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
        int x = s.nextInt();
        int c=0,skip=0;
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        for(int i:ar)
        {
          if(i<=x) c++;
          else {
                if(skip<1)
                skip++;
                else break;
            }
        }
        System.out.println(c);
            
            

        }

    
}
