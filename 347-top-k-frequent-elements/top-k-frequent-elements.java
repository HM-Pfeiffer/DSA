/*
STEPS:
    (1) Create a new hashmap, iterate and add frequency count of each integer in the array.
    (2) Create a priority queue to order elements by frequency.
    (3) Add keys in order of frequency to priorityQueue.
    (4) Create a result array and iterate for up to k times to add values at the top of priority queue to result.

    ** Uncomment print statements as need to walk through code.
**/ 


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mapCount = new HashMap<>();
        for(int n: nums){
            mapCount.put(n, mapCount.getOrDefault(n,0) + 1);
        }
        
        // System.out.println("Frequency map: ");
        // for (Map.Entry<Integer, Integer> entry : mapCount.entrySet()) {
        //     System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
        // }

        // System.out.println("\nBuilding heap:");
        Queue<Integer> heap = new PriorityQueue<>(
            (a, b) -> mapCount.get(a) - mapCount.get(b));
        
        for(int n: mapCount.keySet()){
            heap.add(n);
            // System.out.println("Added to heap: " + n + " (Freq: " + mapCount.get(n) + ")");
            if(heap.size() > k){
                int removed = heap.poll();
                // System.out.println("Heap size > k, removed: " + removed + " (Freq: " + mapCount.get(removed) + ")");
            }
        }
        
        int[] res = new int[k];
        // System.out.println("\nFinal heap (top " + k + " frequent elements, lowest freq at top):");
        // System.out.println(heap);

        for(int i=0; i<k; i++){
            res[i] = heap.poll();
            // System.out.println("Popped from heap: " + res[i]);
        }

        return res;
    }

}