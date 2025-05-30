function isAnagram(s: string, t: string): boolean {
    // check if the length of s and t are equal, if not return false
    if (s.length != t.length) return false;

    // create a new array with 26 characters (one for each of the letters of the alphabet)
    const alphabet = new Array(26).fill(0);

    // create a loop and increment count for every letter present in 
    for(let i: number = 0; i < s.length; i++){
        alphabet[s.charCodeAt(i) - 'a'.charCodeAt(0)]++;
        alphabet[t.charCodeAt(i) - 'a'.charCodeAt(0)]--;
    }

    // check if all elements are 0
    for(const n of alphabet){
        if(n != 0) return false;
    }
    return true;
};