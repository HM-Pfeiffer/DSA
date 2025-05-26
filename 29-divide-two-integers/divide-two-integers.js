/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */
var divide = function(dividend, divisor) {
    // edge case if input result exceeds 32-bit signed integer limit (i.e. 2147483647)
    const MAX_INT = 2147483647
    const MIN_INT = -2147483648

    if(dividend === MIN_INT && divisor === -1){
        return MAX_INT;
    }
    return Math.trunc(dividend/divisor);
};