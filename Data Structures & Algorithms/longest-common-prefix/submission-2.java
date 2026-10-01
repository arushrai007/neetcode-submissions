class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans= new StringBuilder("");
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
        
        for(String word:strs){
            if(i>=word.length() || word.charAt(i)!=ch){
                return ans.toString();
            }
        }
        ans.append(ch);
        }
        return ans.toString();

}

}