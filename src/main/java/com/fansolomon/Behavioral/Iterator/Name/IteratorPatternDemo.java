package com.fansolomon.Behavioral.Iterator.Name;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式
 * 主要用于做容器的遍历
 * 可以查看java实现的Iterator
 * 在java中，一个类只要实现了Iterable接口,就可以使用迭代器遍历,也可以使用foreach语句
 * foreach语句等同于使用迭代器进行遍历（可能foreach也算用迭代器遍历的一种语法糖吧）
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(MyIterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }

        // 可以看下ArrayList的迭代器 支持泛型
        List<String> list = new ArrayList<>();
        list.add("uuu");
        list.add("ggg");
        list.add("ddd");
        list.add("aaa");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // foreach遍历
        /*for (String s : list) {
            System.out.println(s);
        }*/
    }
}
