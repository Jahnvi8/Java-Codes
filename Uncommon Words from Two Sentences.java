// A sentence is a string of single-space separated words where each word consists only of lowercase letters.

// A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

// Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
 

// Example 1:
// Input: s1 = "this apple is sweet", s2 = "this apple is sour"
// Output: ["sweet","sour"]

// Example 2:
// Input: s1 = "apple apple", s2 = "banana"
// Output: ["banana"]
 

// Constraints:

// 1 <= s1.length, s2.length <= 200
// s1 and s2 consist of lowercase English letters and spaces.
// s1 and s2 do not have leading or trailing spaces.
// All the words in s1 and s2 are separated by a single space.
___________________________________________________________________________________________________________________________________________
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm=new HashMap<>();
        String[] s1_array=s1.split(" ");
        String[] s2_array=s2.split(" ");
        
        for(String s:s1_array)
           hm.put(s,hm.getOrDefault(s,0)+1);
        
         for(String s:s2_array)
           hm.put(s,hm.getOrDefault(s,0)+1);
        
         Set<String> set = new HashSet<>();
        for(String s : hm.keySet()) {
            if(hm.get(s) > 1) {
                continue;
            }
            set.add(s);
        }
        
        String[] results = new String[set.size()];
        int index = 0;
        for(String s : set) {
            results[index++] = s;
        }
        
        return results;
        
        
    }
}
