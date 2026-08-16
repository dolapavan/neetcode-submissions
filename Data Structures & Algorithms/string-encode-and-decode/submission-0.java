class Solution {

    public String encode(List<String> strs) {
        String r="";
        for(String s:strs){
            r=r+s.length()+"#"+s;
        }
        return r;
    }

    public List<String> decode(String str) {
        List<String> l=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!= '#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));// get the integer value of length
            i=j+1;
            String word=str.substring(i,i+length);//get the actual word
            l.add(word);
            i=i+length;//move the pointer to next integer (length of next word)
        }
        return l;
    }
}

//for-->You know how many times to loop (or can count with i = 0 to n)
//while-->You loop until a condition is true/false, and you control when to move forward
