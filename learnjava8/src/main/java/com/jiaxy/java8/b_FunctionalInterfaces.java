package src.main.java.com.jiaxy.java8;

import java.io.File;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by wutao on 14-9-2.
 */
public class b_FunctionalInterfaces {

    public static void main(String[] args){
        //Supplier no input,only output
        Supplier<Integer> s1 = () -> "How long am I?".length();
        System.out.println(s1.get());
        //Consumer:input ,no output
        Consumer<Object> c1 = o -> System.out.println(o);
        c1.accept("Hallo");
        //Function:input and output
        Function<Integer,Integer> square = i -> i * i;
        System.out.println(square.apply(2));
        //Predicate:input and boolean output
        Predicate<File> p1 = f -> f.isDirectory();


    }
}
