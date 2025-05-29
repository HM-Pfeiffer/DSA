function twoSum(numbers: number[], target: number): number[] {
    let left: number = numbers.length - 1;
    let right: number = 0;

    while (left > right){
        let total: number = numbers[left] + numbers[right];

        if (total > target){
            left -= 1;
        }
        else if (total < target){
            right += 1;
        }
        else{
            return [right + 1, left + 1];
        }
    }
    return [];
};