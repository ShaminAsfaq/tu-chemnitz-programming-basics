package de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments;

public class AssignmentX {
    public int[] queue(int[] integerList) {
        int length = integerList.length;

        for (int first = 0; first < length; first++) {
            for (int second = first + 1; second < length; second++) {
                if (integerList[first] > integerList[second]) {
                    int temp = integerList[first];
                    integerList[first] = integerList[second];
                    integerList[second] = temp;
                }
            }
        }
        return integerList;
    }

    public int lengthOfLongestSubstring(String givenString) {
        int length = givenString.length();
        int steps = 0;
        boolean[] flag = new boolean[26];

        for (int idx = 0; idx < length; idx++) {
            flag[givenString.charAt(idx) - 'a'] = true;

            int tempSteps = 1;
            for (int tmp = idx + 1; tmp < length; tmp++) {
                if (!flag[givenString.charAt(tmp) - 'a']) {
                    flag[givenString.charAt(tmp) - 'a'] = true;
                    ++tempSteps;
                } else {
                    flag = new boolean[26]; break;
                }
            }
            if (tempSteps > steps) {
                steps = tempSteps;
            }
        }
        return steps;
    }
}
