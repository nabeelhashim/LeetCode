class Solution {
    public String longestCommonPrefix(String[] strs) {
        String compElement = strs[0];
        if(compElement.length() > 0 && strs.length > 1) {
            if(!strs[1].isEmpty() && compElement.charAt(0) != strs[1].charAt(0)) {
            return "";
        } else {
            for(int i=1; i<strs.length; i++) {
                while(strs[i].indexOf(compElement) != 0) {
                    compElement = compElement.substring(0, compElement.length()-1);
                    if(compElement.isEmpty()) {
                        return "";
                    }
                }
            }
        }
        } else {
            return compElement;
        }
        return compElement;
    }
}