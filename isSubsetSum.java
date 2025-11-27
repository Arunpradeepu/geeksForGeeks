class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        ArrayList<Integer> temp = new ArrayList<>();
        return helper(arr,sum,temp,0,0);
    }
    static Boolean helper(int[] arr,int sum,ArrayList<Integer> temp,int ind,int add){
        
        if(add > sum){
            return false;
        }
        
        if(ind == arr.length){
            if(sum == add){
                return true;
            }
            else{
                return false;
            }
        }
        
        temp.add(arr[ind]);
        add += arr[ind];
        if(helper(arr,sum,temp,ind+1,add)){
            return true;
        }
        
        
        temp.remove(temp.size()-1);
        add -= arr[ind];
        if(helper(arr,sum,temp,ind+1,add)){
            return true;
        }
        
        return false;
        
    }
}