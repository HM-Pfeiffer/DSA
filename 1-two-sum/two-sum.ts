function twoSum(nums: number[], target: number): number[] {
    const cache = new Map<number, number>();

    for (let i: number = 0; i < nums.length; i++){
        let complement: number = target - nums[i];
        if (cache.has(complement)){
            return [cache.get(complement), i];
        }
        cache.set(nums[i], i);
    }
    return [];
};