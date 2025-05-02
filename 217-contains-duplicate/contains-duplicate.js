/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const myNumsSet = new Set();
    for(const num of nums){
        if (myNumsSet.has(num)){
            return true;
        }
        myNumsSet.add(num);
    }
    return false;
};