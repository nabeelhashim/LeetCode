class Solution {
    public int romanToInt(String s) {
        int sumOfRomans = 0;
        for(int i=0; i<s.length(); i++) {
            boolean combo = false;
            if((i+1) != s.length()) {
                if(s.charAt(i) == 'I' && s.charAt(i+1) != 'V' && s.charAt(i+1) != 'X') {
                    sumOfRomans = sumOfRomans+1;
                } 
                else if(s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                    sumOfRomans = sumOfRomans+4;
                    combo = true;
                } else if(s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
                    sumOfRomans = sumOfRomans+9;
                    combo = true;
                }
                if(s.charAt(i) == 'X' && s.charAt(i+1) != 'L' && s.charAt(i+1) != 'C') {
                    sumOfRomans = sumOfRomans+10;
                } else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                    sumOfRomans = sumOfRomans+40;
                    combo = true;
                } else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
                    sumOfRomans = sumOfRomans+90;
                    combo = true;
                }
                if(s.charAt(i) == 'C' && s.charAt(i+1) != 'D' && s.charAt(i+1) != 'M') {
                    sumOfRomans = sumOfRomans+100;
                } else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                    sumOfRomans = sumOfRomans+400;
                    combo = true;
                } else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
                    sumOfRomans = sumOfRomans+900;
                    combo = true;
                }
            } else if(s.charAt(i) == 'I') {
                sumOfRomans = sumOfRomans+1;
                } else if(s.charAt(i) == 'X') {
                        sumOfRomans = sumOfRomans+10;
                    } else if(s.charAt(i) == 'C') {
                        sumOfRomans = sumOfRomans+100;
                    }
            if(s.charAt(i) == 'V') {
                sumOfRomans = sumOfRomans+5;
            }
            if(s.charAt(i) == 'L') {
                sumOfRomans = sumOfRomans+50;
            }
            if(s.charAt(i) == 'D') {
                sumOfRomans = sumOfRomans+500;
            }
            if(s.charAt(i) == 'M') {
                sumOfRomans = sumOfRomans+1000;
            }
            if(combo == true) {
                i++;
            }
        
        }
        return sumOfRomans;
    }
}