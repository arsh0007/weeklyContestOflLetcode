class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        int len = words.size();
            List<String> ans = new ArrayList<>();
            
            String str= "";
            for(int i=0; i<len; i++)
            {
                String sr = words.get(i);
                    for(int j=0; j<sr.length(); j++)
                    {
                            char c = sr.charAt(j);
                            if(c!=separator)
                            {
                                    str =str+""+c;
                                    if(j==sr.length()-1 && str.length()>0) ans.add(str);
                                    
                            }
                            else
                            {
                                    if(str.length()>0)
                                    {
                                            ans.add(str);
                                            str="";
                                    }
                            }
                    }
                    str="";
            }
            return ans;
    }
}
