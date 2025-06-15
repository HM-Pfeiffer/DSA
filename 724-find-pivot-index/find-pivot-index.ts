function pivotIndex(nums: number[]): number {
    const globalSum = nums.reduce((a,b) => a + b);
    let leftSum = 0; 

    for (let i = 0; i < nums.length; i++) {
        if (globalSum - (leftSum * 2) === nums[i]) {
            return i;
        }
        leftSum += nums[i];
    }
    return -1;
};