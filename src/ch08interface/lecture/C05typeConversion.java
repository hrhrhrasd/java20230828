package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.util.concurrent.atomic.AtomicInteger;

public class C05typeConversion {
    Integer i = 3;

    Object a = i;
    Serializable s = i;
    Comparable<Integer> cp = i;
    Constable con = i;
    ConstantDesc cd = i;

    Number n = i;


}
