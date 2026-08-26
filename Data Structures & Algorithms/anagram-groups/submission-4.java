class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> m=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();//change each string to char[]
            Arrays.sort(c);//sort char[]
            String s=new String(c); //creating the key to put in map

            m.putIfAbsent(s,new ArrayList<>());//put key,value in map
            m.get(s).add(strs[i]);//if mathcing key then add values

        }
        return new ArrayList<>(m.values());
        // create a List and return all the values(list of string) which creates List<List<String>>
    }
}
