package fundamentals;

public class StringManipulator {


    // String trimAndConcat(String, String): Trim both input strings and then concatenate them. Return the new string.
    public String trimAndConcat(String str1, String str2){
        return str1.trim().concat( str2.trim());
    }

    // Integer getIndexOrNull(String, char): Get the index of the character and return either the index or null.
    // If the character appears multiple times, return the first index.
    public Integer getIndexOrNull(String str, char ch){
        Integer response = str.indexOf( ch );
        if(response == -1){
            return null;
        }
        else{
            return response;
        }
    }


    // Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null.
    // Feel free to use the indexOf method of the String class.
    public Integer getIndexOrNull(String word, String subString){
        Integer response = word.indexOf(subString);
        if(response == -1){
            return null;
        }
        else{
            return response;
        }
    }


    // String concatSubstring(String, int, int, String): Get a substring using a starting and ending index,
    // and concatenate that with the second string input to our method.
    public String concatSubstring(String str, int start, int end, String str2){
        return str.substring( start, end ).concat( str2 );
    }


}
