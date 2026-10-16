package RemoveAllWhiteSpaces;

public class StringRemovalWithout {
    static void main() {
        int x;
        String str="Rohan is a mad guy";
        String result="";
        for(x=0;x<str.length();x++)
        {
            char ch=str.charAt(x);
            if(ch!=' ')
            {
                result=result+ch;
            }
        }
        System.out.println("---------after removal----------");
        System.out.println(result);
    }
}
