/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    // create a hashmap to store n as key and its index as value
    const seen = new Map();

    // iterate through arr
    for(let i = 0; i < nums.length; i++){
      // declare a var to store complement of target - currrent num 
      const complement = target - nums[i];
      // if current num exists in the map, return the index value stored from map and current index in an arr
      if(seen.has(complement)) {
        return [seen.get(complement), i];
      }
      seen.set(nums[i], i);
    }
    // return empty array (i.e. no two values evaluate to target)
    return [];
};