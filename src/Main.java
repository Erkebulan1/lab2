import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main (String[] arg){
        String str = "меня зовут Aizhan мне (36) лет (родился 01 января 1987), высшее образование, cостоит в браке, есть дети" +
                "Москва, не готов к командировкам";
        System.out.println(str);
        String output = str.replaceAll("\\d*\\d+","Consered");
        String out = output.replaceAll("Aizhan+", "Consered");
        System.out.println(out);

    }
}
