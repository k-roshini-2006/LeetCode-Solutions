class Solution {
public:
    string reverseVowels(string s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!isVowel(s[left])) {
                left++;
            }
            else if (!isVowel(s[right])) {
                right--;
            }
            else {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }

        return s;
    }

    bool isVowel(char ch) {
        return string("aeiouAEIOU").find(ch) != string::npos;
    }
};