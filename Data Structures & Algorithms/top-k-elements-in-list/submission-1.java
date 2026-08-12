class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
//p1
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
//p2
        List<Integer>[] arr=new List[nums.length+1];
        for(int x:m.keySet()){
            int freq=m.get(x);
            if(arr[freq]==null){
                arr[freq]= new ArrayList<>();
            }
            arr[freq].add(x);
        }

//p3
        int[] r=new int[k];
        int index=0;
        for(int i=arr.length-1; i>=0 && index<k;i--){
            if(arr[i]!=null){
                for(int x:arr[i]){
                    r[index]=x;
                    index++;
                    if(index==k){
                        break;
                    }
                }
            }
        }
        return r;
    }
}






//part1 using hashMap we create 1->1, 2->2, 3->3 
//part2 using List<Integer>[] to create frequency like 1 sits at index 1, 2 sists at index2 as it repeated twice and 3 sits at index3 as it repeated thrice

//part2-->why nums.length+ 1 is because index is frequency if you take ex2 7 repeated twice which means it sits at index-2 so size of array should be 3
// part 3 what it does is it iterates lists in arr , and it iterates elements in the list and fills result array until k so ti handle this we added if(index==k){break;} but we still need to handle outer loop also because in our examples inner loop has one element in the list but outer loop can through arrayIndexOOBExaception so to avoid this we need to add index<k condition in outer loop

//part3--> lets take ex2, 7 sits at index2 where arr size is 3 but we need to iterate from index 2 so that is why we took i<arr.length-1