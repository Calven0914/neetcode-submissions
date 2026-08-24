class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> counts = new HashMap<>();

        for(int i =0; i <s.length(); i++){
            counts.put(s.charAt(i), counts.getOrDefault(s.charAt(i),0)+1);
        }

        for (int j=0; j < s.length(); j++){
            if(counts.get(s.charAt(j)) == 1){
                return j;
            }
        }
        return -1;
        
    }
}