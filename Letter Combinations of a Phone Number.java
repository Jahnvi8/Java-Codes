/* Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digit to letters (just like on the telephone buttons). Note that 1 does not map to any letters.
Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = ""
Output: []

Example 3:
Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:
0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].    */

__________________________________________________________________________________________
import java.util.*;
import java.util.Scanner;
class Main{
   public static void main(String[] args)
   {   Scanner sc=new Scanner(System.in);
       System.out.println("enter string");
       String digits=sc.nextLine();
       System.out.println(letterCombinations(digits));
   }
public List<String> letterCombinations(String digits) {
        HashMap<Character, String[]> map = new HashMap<>();
        
        map.put('2', new String[]{"a", "b", "c"});
        map.put('3', new String[]{"d", "e", "f"});
        map.put('4', new String[]{"g", "h", "i"});
        map.put('5', new String[]{"j", "k", "l"});
        map.put('6', new String[]{"m", "n", "o"});
        map.put('7', new String[]{"p", "q", "r", "s"});
        map.put('8', new String[]{"t", "u", "v"});
        map.put('9', new String[]{"w", "x", "y", "z"});
        
        List<String> ans  = new ArrayList<>();
        dfs_(map, digits, 0, ans, new StringBuilder());    
        
        return ans;
    }
    
    public void dfs_(HashMap<Character, String[]> map, String s, int index, List<String> ans, StringBuilder curr){
        if(index == s.length()){
            if(index != 0){
                ans.add(curr.toString());
            }
            return;
        }
        
        for(String ch : map.get(str.charAt(index))){
            curr.append(ch);
            dfs(map, s, index + 1, ans, curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
  }
