package de.chemnitztu.tuchemnitzprogrammingbasics.utils;

import org.springframework.stereotype.Service;

@Service
public class LectureTwo {
    public String decimalToBinary(int number) {
        StringBuilder binary = new StringBuilder();

        while(true) {
            binary.append(number % 2);
            number/=2;
            if (number == 1) {
                binary.append(1); break;
            } else if (number == 0) {
                break;
            }
        }

        return binary.reverse().toString();
    }

    public String decimalToHexadecimal(int number) {
        String binary = decimalToBinary(number);

        StringBuilder hexa = new StringBuilder();
        int deficit = 0;
        int binaryLength = binary.length();

        if (binaryLength % 4 > 0) {
            deficit = 4 - (binary.length() % 4);
        }

        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < deficit; i++) {
            temp.append("0");
        }
        binary = temp + binary;
        binaryLength = binary.length();

        int slider = 0;
        int total = 0;
        for (int ii = binaryLength - 1; ii >= 0; ii--) {
            double pow = Math.pow(2, slider);
            pow *= Integer.parseInt(binary.charAt(ii) + "");
            total+= pow;
            ++slider;

            if (slider == 4) {
                slider = 0;
                if (total >= 10) {
                    if (total == 10) {
                        hexa.append("A");
                    } else if (total == 11) {
                        hexa.append("B");
                    } else if (total == 12) {
                        hexa.append("C");
                    } else if (total == 13) {
                        hexa.append("D");
                    } else if (total == 14) {
                        hexa.append("E");
                    } else if (total == 15) {
                        hexa.append("F");
                    }
                } else {
                    hexa.append(total);
                }
                total = 0;
            }
        }

        return hexa.reverse().toString();
    }

}
