package src.main.java.com.jiaxy.java8;

import java.io.File;

/**
 * Created by wutao on 14-9-1.
 */
public class a_LambdasIntro {

    public static void main(String[] args){
        File file = new File("/tmp");
        file.listFiles((File f) -> f.isDirectory());
        //type interface
        file.listFiles( f -> f.isDirectory());
        //method reference
        file.listFiles(File::isDirectory);
    }

}
