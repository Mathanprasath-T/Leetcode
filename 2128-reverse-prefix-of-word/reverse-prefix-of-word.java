class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>stack=new Stack<>();
        StringBuilder ans=new StringBuilder();
         boolean  found=false;
        for(char letters:word.toCharArray()){
           
            if(!found){
                stack.push(letters);
            
            if(letters==ch){
                found=true;
                while(!stack.isEmpty()){
                    ans.append(stack.pop());
                }
            }
            }
            else{
              
                  ans.append(letters);
               
            }
        }
        if(!found){
            return word;
        }
        return ans.toString();
    }
}