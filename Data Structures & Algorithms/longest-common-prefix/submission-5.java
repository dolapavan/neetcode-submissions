class Solution {
    public String longestCommonPrefix(String[] strs) {

        String s=strs[0];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            for(int j=0;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i) !=c){
                    return s.substring(0,i);
                }
            }
        }
        return s;
    }
}

//i>=strs[j].length() is required for hidden test cases (you can remove and submit to get to know why we added this)- eg: strs=["abc","","abcd"]