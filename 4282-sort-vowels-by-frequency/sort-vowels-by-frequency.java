class Solution {
    public String sortVowels(String s) {
        List<Triple> list = new ArrayList<>();
        HashMap<Character, Pair> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                if (hm.containsKey(ch)) {
                    hm.get(ch).cnt++;
                } else {
                    hm.put(ch, new Pair(1, i));
                }
            }
        }
        for (Map.Entry<Character, Pair> itr: hm.entrySet()) {
            char ch = itr.getKey();
            Pair p = itr.getValue();
            list.add(new Triple(ch, p.cnt, p.order));
        }
        Collections.sort(list, (a, b) -> {
            if (a.cnt == b.cnt) {
                return a.order - b.order;
            }
            return b.cnt - a.cnt;
        });
        StringBuilder res = new StringBuilder();
        int ind = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                res.append(list.get(ind).ch);
                list.get(ind).cnt--;
                if (list.get(ind).cnt == 0) {
                    ind++;
                }
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
    public boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
    class Pair {
        int cnt;
        int order;
        Pair (int cnt, int order) {
            this.cnt = cnt;
            this.order = order;
        }
    }
    class Triple {
        char ch;
        int cnt;
        int order;
        Triple (char ch, int cnt, int order) {
            this.ch = ch;
            this.cnt = cnt;
            this.order = order;
        }
    }
}