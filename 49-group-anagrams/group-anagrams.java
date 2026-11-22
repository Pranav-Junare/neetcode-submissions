class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        Map<String, List<String>>map = new HashMap<>();

        
        for(String str:strs){
            int[] count = new int[26];
            for(char s : str.toCharArray()){
                count[s-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(count[i]).append("#");
            }
            String key=sb.toString();

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}