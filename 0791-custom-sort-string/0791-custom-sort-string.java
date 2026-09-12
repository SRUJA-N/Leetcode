class Solution {
    public String customSortString(String order, String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

      
        for (char c : order.toCharArray()) {

            if (map.containsKey(c)) {

                int count = map.get(c);

                while (count > 0) {
                    result.append(c);
                    count--;
                }

                map.remove(c);
            }
        }

     
        for (char c : map.keySet()) {

            int count = map.get(c);

            while (count > 0) {
                result.append(c);
                count--;
            }
        }

        return result.toString();
    }
}