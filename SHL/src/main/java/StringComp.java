import java.util.Arrays;

public class StringComp {

    public StringComp() {}
    public Boolean cmpStrings(String one, String two) {
        return one.equals(two);
    }

    public char[] sortStrings(String strToSort) {
        char[] array = strToSort.toCharArray();
        Arrays.sort(array);
        return array;
    }
    public Boolean compareStrings(String stringOne, String stringTwo) {
        Boolean result = false;
        char[] arrOne = stringOne.toCharArray();
        Arrays.sort(arrOne);
        //System.out.println(arrOne);
        char[] arrTwo = stringTwo.toCharArray();
        Arrays.sort(arrTwo);
        //System.out.println(arrTwo);
        if(arrOne.length != arrTwo.length)
            result = false;
        else {

            for(Integer i=0; i<arrOne.length; i++)
            {
                if(arrOne[i] == arrTwo[i])
                    result = true;
                else
                    result = false;
            }
        }
        return result;
    }
    public String cleanString(String toBeCleaned) {
        String cleanedStr = toBeCleaned.replaceAll(" ","");
        //System.out.println(cleanedStr);
        return cleanedStr;
    }

}
