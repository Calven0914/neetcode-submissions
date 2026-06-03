class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder newStr = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }

        // return newStr.toString().equals(newStr.reverse().toString());

        int l = 0;
        int r = newStr.length() -1;

        while (l < r){
            if(newStr.charAt(l) != newStr.charAt(r)){
                return false;                
            } 
                l++;
                r--;                     
        }
        return true;
    }
        
    
}
