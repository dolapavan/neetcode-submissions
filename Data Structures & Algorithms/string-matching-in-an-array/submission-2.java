class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> s=new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[i].contains(words[j])){
                    s.add(words[j]);
                }
            }
        }
        return new ArrayList<>(s);
    }
}


// note: Hidden test cases expects not to return a word more than once so to avoid that we add into set and return list .eg:1. "cats".contains("cat") , 2."catsdogcats".contains("cat") , 3."ratcatdogcat".contains("cat")



//or
// class Solution {
//     public List<String> stringMatching(String[] words) {
//         List<String> l = new ArrayList<>();

//         for (int i = 0; i < words.length; i++) {
//             for (int j = 0; j < words.length; j++) {
//                 if (i != j && words[j].contains(words[i])) {
//                     l.add(words[i]);
//                     break;  // found a container → stop for this word
//                 }
//             }
//         }
//         return l;
//     }
// }