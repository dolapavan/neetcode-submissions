class Solution {
    public int countSeniors(String[] details) {

        int count=0;
        for(String s:details){
            int i=10;
            if(s.charAt(i) == 'M' || s.charAt(i) == 'F' || s.charAt(i) == 'O'){
                int age=Integer.parseInt(s.substring(i+1,i+3));
                if(age>60){
                    count++;
                }
            }
        }
        return count;
    }
}


// or 

// class Solution {
//     public int countSeniors(String[] details) {

//         int count=0;
//         for(String s:details){
//             int i=10;
//             int age=Integer.parseInt(s.substring(i+1,i+3));
//             if(age>60){
//                 count++;
//             }
//         }
//         return count;
//     }
// }