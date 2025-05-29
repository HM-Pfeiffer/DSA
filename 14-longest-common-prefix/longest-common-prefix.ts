function longestCommonPrefix(strs: string[]): string {
    let prefix: string = "";
    const shortest_word: string = strs.reduce((a, b) => (a.length < b.length ? a : b));

    for(let i = 0; i < shortest_word.length; i++){
        for (const word of strs){
            if(word[i] != shortest_word[i]){
                return prefix;
            }
        }
        prefix += shortest_word[i];
    }
    return prefix;

};