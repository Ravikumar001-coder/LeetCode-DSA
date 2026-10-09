class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int l = 0;
        int h = 0;
        int max = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(h<n){
            int keyR = fruits[h];
            map.put(keyR, map.getOrDefault(keyR, 0) +1);

            if(map.size() <= 2){
                max = Math.max(max, h-l+1);
            }
            else if(map.size() > 2){
                while(map.size() >2){
                    int keyL = fruits[l];
                    map.put(keyL, map.get(keyL)-1);
                    if(map.get(keyL) == 0){
                        map.remove(keyL);
                    }
                    l++;
                }
            }
            h++;
        }
        return max;
    }
}