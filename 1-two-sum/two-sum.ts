function twoSum(nums: number[], target: number): number[] {
    let l: number = 0;
    let r: number = 0; 
    const cache = new Map<number, number>();

    for (let i: number = 0; i < nums.length; i++){
        let complement: number = target - nums[i];
        console.log(complement);
        if (cache.has(complement)){
            return [cache.get(complement), i];
        }
        cache.set(nums[i], i);
    }
    return [];
};