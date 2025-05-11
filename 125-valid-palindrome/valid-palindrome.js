/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.replace(/[^a-zA-Z0-9]/g, '');
    s = s.toLowerCase();
    const mid_len = Math.floor(s.length/2);

    for(let i = 0; i < mid_len; i++){
        if(s[i] !== s[s.length - 1 - i]){
            return false;
        }
    }
    return true;
};