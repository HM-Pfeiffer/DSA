/**
 * @param {number[]} nums
 * @return {number}
 */

var majorityElement = function(nums) {
    let maxCount = 0;
    let majority = -1;
    const map = new Map();

    for(const n of nums){
       let freq = (map.get(n) || 0) + 1;
        map.set(n, freq);

        if(freq > maxCount){
            maxCount = freq; 
            majority = n;
        }
    }
    return majority;
};
