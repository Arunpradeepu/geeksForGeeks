class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        if(a.length != b.length){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int x:a){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        
        for(int y:b){
            if(!map.containsKey(y)){
                return false;
            }
            map.put(y,map.get(y) - 1);
            if(map.get(y) == 0){
                map.remove(y);
            }
        }
        return map.isEmpty();
    }
}