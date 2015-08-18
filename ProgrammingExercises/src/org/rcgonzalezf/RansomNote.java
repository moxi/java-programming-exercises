package org.rcgonzalezf;

public class RansomNote {

    public boolean canRansom(String ransom, String magazine) {
        if(ransom.length() > magazine.length()) {
            return false;
        }

        java.util.Map<String, Integer> ransomMap = new java.util.HashMap<>();
        String[] ransomWords = ransom.split(" ");

        for(String ransomWord: ransomWords) {
            if(ransomMap.containsKey(ransomWord)) {
                Integer times = ransomMap.get(ransomWord);
                ransomMap.put(ransomWord, ++times);
            } else {
                ransomMap.put(ransomWord, 0);
            }
        }

        for (String magazineWord : magazine.split(" ")) {
            if(ransomMap.containsKey(magazineWord)) {
                Integer times = ransomMap.get(magazineWord);
                if(times>0) {
                    ransomMap.put(magazineWord,--times);
                } else {
                    ransomMap.remove(magazineWord);
                }

                if(ransomMap.keySet().isEmpty()){
                    return true;
                }
            }
        }

        return ransomMap.keySet().isEmpty();
    }
}
