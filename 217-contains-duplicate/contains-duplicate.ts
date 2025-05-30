function containsDuplicate(nums: number[]): boolean {
    const numsSet = new Set<number>();

    for(const n of nums){
        if(numsSet.has(n)){
            return true;
        }
        numsSet.add(n);
    }
    return false;
};