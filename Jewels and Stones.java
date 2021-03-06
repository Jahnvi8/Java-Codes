// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
//   Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

// Letters are case sensitive, so "a" is considered a different type of stone from "A".

// Example 1:
// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3
  
// Example 2:
// Input: jewels = "z", stones = "ZZ"
// Output: 0
 

// Constraints:

// 1 <= jewels.length, stones.length <= 50
// jewels and stones consist of only English letters.
// All the characters of jewels are unique.

____________________________________________________________________________________________________________________________
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        
     for(int i=0;i<stones.length();i++){
         char c=stones.charAt(i);
         if(hm.containsKey(c)) 
         hm.put(c,hm.get(c)+1);
         else
             hm.put(c,1);
     }
        for(int i=0;i<jewels.length();i++){
            char c=jewels.charAt(i);
            if(hm.containsKey(c))
                count+=hm.get(c);
        }
        return count;
    }
}
