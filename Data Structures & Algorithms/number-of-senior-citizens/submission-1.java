class Solution {
    public int countSeniors(String[] details) {

        int count=0;
        for(String s:details){
            int i=10;
            int j=i+1;
            if(i<s.length() && (s.charAt(i) == 'M' || s.charAt(i) == 'F' || s.charAt(i) == 'O')){
                int age=Integer.parseInt(s.substring(j,j+2));
                if(age>60){
                    count++;
                }
            }
        }
        return count;
    }
}