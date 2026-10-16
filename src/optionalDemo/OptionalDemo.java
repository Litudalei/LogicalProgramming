package optionalDemo;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo {
    static void main() {
        Optional<String> msg=sayHello();
        if(msg.isPresent())
        {
            String content=msg.get();
        System.out.println(content.toUpperCase());
    }}
    public static Optional<String> sayHello()
    {
        int num=new Random().nextInt();
        System.out.println(num);
        if(num%2==0)
        {
            return Optional.of("the number is even");
        }
        else {
        return Optional.empty();
    }}

}
