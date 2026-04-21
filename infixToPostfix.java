class Solution {
    
    public static int priority(char ch){
        if(ch == '^'){
            return 3;
        }
        else if(ch == '*' || ch == '/'){
            return 2;
        }
        if(ch == '+' || ch == '-'){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    
    public static String infixToPostfix(String s) {
        // code here
        int i = 0;
        Stack<Character> stk = new Stack<>();
        StringBuilder ans = new StringBuilder();
        
        while(i < s.length()){
            if(Character.isLetterOrDigit(s.charAt(i))){
                ans.append(s.charAt(i));
            }
            
            else if(s.charAt(i) == '('){
                stk.push(s.charAt(i));
            }
            
            else if(s.charAt(i) == ')'){
                while(!stk.isEmpty() && stk.peek() != '('){
                    ans.append(stk.peek());
                    stk.pop();
                }
                
                stk.pop();
            }
            
            else{
                while(!stk.isEmpty()  &&
                (priority(s.charAt(i)) < priority(stk.peek()) || 
                (priority(s.charAt(i)) == priority(stk.peek()) && s.charAt(i) != '^'))){
                    ans.append(stk.peek());
                    stk.pop();
                }
                stk.push(s.charAt(i));
            }
            
        i++;    
        }
        
        while(!stk.isEmpty()){
                ans.append(stk.peek());
                stk.pop();
        }
        
        return ans.toString();    
    }
}