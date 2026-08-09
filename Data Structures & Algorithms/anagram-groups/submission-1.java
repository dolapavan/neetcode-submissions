class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> m=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();//
            Arrays.sort(c);
            String s=new String(c);

            m.putIfAbsent(s,new ArrayList<>());
            m.get(s).add(strs[i]);

        }
        return new ArrayList<>(m.values());
    }
}
