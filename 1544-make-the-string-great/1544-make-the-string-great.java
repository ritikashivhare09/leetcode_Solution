
class Solution {
    public String makeGood(String s) {

        StringBuilder st = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (st.length() > 0 &&
                Math.abs(st.charAt(st.length() - 1) - ch) == 32) {

                st.deleteCharAt(st.length() - 1);

            } else {
                st.append(ch);
            }
        }

        return st.toString();
    }
}

