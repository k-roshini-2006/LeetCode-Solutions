class Solution {
    public String reorderSpaces(String text) {
       String[] words=text.trim().split("\\s+");
       int space=0;
       for(int i=0;i<text.length();i++){
          if(text.charAt(i)==' '){
            space++;
          }
       }
       int n=words.length;
       if(n==1){
          return words[0]+" ".repeat(space);
       }
       int eqSpace=space/(n-1);
       return String.join(" ".repeat(eqSpace),words) + " ".repeat(space % (n-1));
    }
}