class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        List<Integer>[] arr=new List[nums.length+1];// array of lists; index = frequency

        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);// count how many times each number appears
        }

        for(int x:m.keySet()){
            int freq=m.get(x);
            if(arr[freq]==null){
                arr[freq] = new ArrayList<>();// create list first time this frequency is used
            }
            arr[freq].add(x);
        }

        int[] r=new int[k];
        int index=0;
        for(int i=arr.length-1;i>=0 && index<k;i--){// scan from highest frequency to lowest
            if(arr[i]!=null){
                for(int a:arr[i]){
                    r[index]=a;// store current number in result
                    index++;
                    if(index==k){
                        break;// stop once we have k elements
                    }
                }
            }
        }
        return r;

    }
}
