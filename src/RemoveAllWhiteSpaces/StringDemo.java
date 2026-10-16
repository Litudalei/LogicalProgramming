package RemoveAllWhiteSpaces;

public class StringDemo {
    static void main() {
        String s="Java Is a Programming Language";
        System.out.println(">>>>>>>>>before ----------");
        System.out.println(s);
        String result=s.replaceAll("\\s","");
        System.out.println(">>>>>>>After Removing spaces>>>>>>>>>");
        System.out.println(result);
    }
}
