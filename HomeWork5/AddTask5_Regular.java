package HomeWork5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddTask5_Regular {

    //регулярка, которая проверит, что в заданной строке содержится не более 4х букв латинского алфавита.
    public static boolean regExpNoMore4Letters (String testString) {
        String pattern ="^[^a-zA-Z]*[a-zA-Z]{1,4}[^a-zA-Z]*$";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        return m.matches();
    }
    // регулярка, которая проверит, что в заданной строке содержится ровно 4 любых символа.
    public static boolean regExpExactly4AnySymbol(String testString) {
        String pattern = "^.{4}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        return m.matches();
    }


    public static void main(String args[]){

        System.out.println("Check first regular expression. No more 4 lat letters:");
        System.out.println(regExpNoMore4Letters("abc"));
        System.out.println(regExpNoMore4Letters("123abc"));
        System.out.println(regExpNoMore4Letters("125abcddd$"));
        System.out.println(regExpNoMore4Letters("125abc$avvc"));

        System.out.println("Check second regular expression. Exactly 4 any symbol:");
        System.out.println(regExpExactly4AnySymbol("1234"));
        System.out.println(regExpExactly4AnySymbol("12345"));



    }

}


