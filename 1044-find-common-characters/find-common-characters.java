class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();

        // Map to store the frequency of characters in the first word
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Populate charFrequency with characters and their frequencies from the first word
        for (char c : words[0].toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Iterate through the rest of the words
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentWordFrequency = new HashMap<>();

            // Count the frequency of characters in the current word
            for (char c : words[i].toCharArray()) {
                currentWordFrequency.put(c, currentWordFrequency.getOrDefault(c, 0) + 1);
            }

            // Update charFrequency to keep only the common characters and their minimum frequencies
            for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
                char c = entry.getKey();
                int minFrequency = Math.min(entry.getValue(), currentWordFrequency.getOrDefault(c, 0));
                charFrequency.put(c, minFrequency);
            }
        }

        // Build the result list based on the final charFrequency map
        for (char c : charFrequency.keySet()) {
            int frequency = charFrequency.get(c);
            for (int j = 0; j < frequency; j++) {
                ans.add(Character.toString(c));
            }
        }

        return ans;
    }
}
