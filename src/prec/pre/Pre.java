package prec.pre;

import java.io.File;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Pre {
    public static void main(String[] args) {
        File file = new File("C:/Temp/asd/asd.txt");
        System.out.println(file.getParent());

        File file1 = new File(file.getParent());
        System.out.println(file1);


        File file2 = file.getParentFile();
        System.out.println(file2);



    }

}



