package chap01;

public class Clap {
    public static void main(String[] args) {
        int number = 13;
        int answer = clapResult(number);
        System.out.println(answer);
    }

    private static int clapResult(int number) {
        int clapNum = 0;
        int [] validDigits = {3, 6, 9};

        while (number != 0) {
            int digit = number % 10;

            for (int validDigit : validDigits) {
                if (digit == validDigit) {
                    clapNum += 1;
                }
            }

            number /= 10;
        }

        return clapNum;
    }


}



