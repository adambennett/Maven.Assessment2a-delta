package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        int size = endingIndex - startingIndex;
        if (size > 0) {
            String[] newArr = new String[size];
            int iter = 0;
            for (int i = startingIndex; i < endingIndex; i++, iter++) {
                newArr[iter] = arrayToBeSpliced[i];
            }
            return newArr;
        }
        return new String[1];
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        if (startingIndex < arrayToBeSpliced.length && startingIndex > -1) {
            int size = arrayToBeSpliced.length - startingIndex;
            String[] newArr = new String[size];
            int iter = 0;
            for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
                newArr[iter] = arrayToBeSpliced[i];
                iter++;
            }
            return newArr;
        }
        return new String[1];
    }
}
