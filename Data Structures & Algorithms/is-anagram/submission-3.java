class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();// string to char array
        char[] b=t.toCharArray();
        Arrays.sort(a);//sort array
        Arrays.sort(b);
        return Arrays.equals(a,b);//check both arrays are same and return
    }
}
