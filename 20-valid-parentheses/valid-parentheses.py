class Solution:
    def isValid(self, s: str) -> bool:
        # create a ref obj that holds parenthesis pairs 
        # declare empty stack 
        paren_pairs = {
            "}" : "{",
            ")" : "(",
            "]" : "["
        }
        stack = []

        # iterate through string 
        for paren in s: 
            # if stack is empty - append string to stack 
            if not stack: 
                stack.append(paren)
            # check if current string is currently equal to its corresponding val in the pairs obj
            elif paren in paren_pairs and paren_pairs[paren] == stack[-1]:
                # if yes, pop the last el (opening paren) off the stack
                stack.pop()
            # else append item to the stack 
            else:
                stack.append(paren)
        
        # return whether the stack is empty (true) or not (false)
        return not stack