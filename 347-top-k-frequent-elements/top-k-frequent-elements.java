class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mapCount = new HashMap<>();
        for(int n: nums){
            mapCount.put(n, mapCount.getOrDefault(n,0) + 1);
        }
        
        Queue<Integer> heap = new PriorityQueue<>(
            (a, b) -> mapCount.get(a) - mapCount.get(b));
        
        for(int n: mapCount.keySet()){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }
        
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = heap.poll();
        }

        return res;
    }

}