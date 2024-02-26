class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
         List<String> list = new ArrayList<>();
        list.add("");
        for (char ch : s.toCharArray()) {
            int n = list.size();
            for (int i = 0; i < n; i++) {
                String str = list.get(i);
                StringBuilder sb = new StringBuilder(str);
                sb.append(ch);
                list.add(sb.toString());
            }
        }
        list.remove(0);
        Collections.sort(list);
        return list;
    }
}
