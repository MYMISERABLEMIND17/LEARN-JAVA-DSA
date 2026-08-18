public class Problem_744 {

    public static void main(String[] args) {

        String s = "ABCABCAA";
        int k = 3;

        int result = characterReplacement(s, k);

        System.out.println(result);
    }

    static int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';

            freq[index]++;

            maxFreq = Math.max(maxFreq, freq[index]);

            int windowLength = right - left + 1;

            int replacements = windowLength - maxFreq;

            if (replacements > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}