package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String toRet = "";
        while (toRet.length() < amountOfPadding - stringToBePadded.length()) {
            toRet += " ";
        }
        toRet += stringToBePadded;
        return toRet;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String toRet = stringToBePadded;
        while (toRet.length() < amountOfPadding) {
            toRet += " ";
        }
        return toRet;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String toRet = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            toRet += stringToBeRepeated;
        }
        return toRet;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        for (Character c : string.toCharArray()) {
            if (!Character.isAlphabetic(c) && !Character.isWhitespace(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for (Character c : string.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        char c;
        int cint;
        int specialCharacterCount = 0;
        for(int n = 0; n < string.length(); n ++)
        {
            c = string.charAt(n);
            cint = (int)c;
            if(cint <48 || (cint > 57 && cint < 65) || (cint > 90 && cint < 97) || cint > 122)
            {
                specialCharacterCount++;
            }
        }
        return specialCharacterCount == string.length();
    }
}
