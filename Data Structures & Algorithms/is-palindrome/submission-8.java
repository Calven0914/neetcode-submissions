class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder newstr = new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newstr.append(Character.toLowerCase(c));
            }

        }
        
        int l=0;
        int r = newstr.length()-1;

        while(l < r){
            if(newstr.charAt(l) != newstr.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
