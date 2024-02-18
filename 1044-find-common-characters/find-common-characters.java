class Solution {
    public List<String> commonChars(String[] words) {
      
      int[] chars = new int[26];

      for(int i=0; i < words[0].length(); i++){
          int index = words[0].charAt(i) - 'a';
          chars[index]++;
      }

      for(int i=1; i < words.length; i++){
          updateCommonFreq(words[i], chars);
      }  
      
      List<String> out = new ArrayList<>();
      for(int i=0; i < 26; i++){

            if(chars[i] != 0 ){
                int index = chars[i];
                while(index > 0){
                     out.add(""+(char)(i+'a'));
                     index--;
                }      
            }
        }
        return out;
    }

    public void updateCommonFreq(String word, int[] chars){

        int[] chars1 = new int[26];

        for(int i=0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            chars1[index]++;
        }

        for(int i=0; i < 26; i++){

            if(chars[i] != 0 && chars1[i] == 0)
                chars[i] = 0;

            if(chars[i] != 0 && chars1[i] != 0)
                chars[i] = Math.min(chars[i], chars1[i]);              
        }
    }

   
}
