package com.practice.streams.util;

import java.util.Map;

public class OutputPrinter {

    public static void printMap(Map map)
    {
        map.forEach((key,value)-> System.out.println(key+" ==> "+value));
    }
}
