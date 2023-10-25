package chap01_Strategy;

public class Duplicate {

    public static void main(String[] args) {
        String inputString = "browoanoommnaon"; // 중복 문자열을 제거할 문자열

        String resultString = decoder(inputString);

        System.out.println("연속으로 중복된 문자가 제거된 문자열: " + resultString);
    }

    private static String decoder(String word) {
        while (isWordFinished(word)) {
            word = removeConsecutiveDuplicateCharacters(word);
        }
        return word;
    }


    // 연속으로 중복된 문자가 있는지 확인하는 함수
    private static boolean isWordFinished(String word) {
        for (int i = 1; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            char previousChar = word.charAt(i - 1);

            if (currentChar == previousChar) {
                return true; // 연속으로 중복된 문자가 있다면 true 반환
            }
        }

        return false;
    }

    // 연속으로 중복된 문자를 제거하는 함수
    public static String removeConsecutiveDuplicateCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return str; // 빈 문자열이나 null인 경우 그대로 반환
        }

        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0)); // 첫 번째 문자는 무조건 추가

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char previousChar = str.charAt(i - 1);

            if (currentChar != previousChar) {
                result.append(currentChar); // 연속 중복이 아니면 문자 추가
            }
            else {
                result.deleteCharAt(result.length() - 1);
            }
        }

        return result.toString();
    }


}
