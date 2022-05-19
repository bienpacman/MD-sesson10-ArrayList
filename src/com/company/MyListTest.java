package com.company;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("(4) = "+listInteger.get(3));
        System.out.println("(1) = "+listInteger.get(1));
        System.out.println("(0) = "+listInteger.get(0));
        listInteger.add(23);
        listInteger.add(34);
        System.out.println("________________Check add phần tử vào cuối________________");
        System.out.println(listInteger.getSize());
        listInteger.render();
        System.out.println("________________add phần tử vào giữa________________");

        listInteger.add(3,15);
        listInteger.render();
        System.out.println("_________________remove phần tử_______________");
        System.out.println("remove element ====="+listInteger.remove(3));;
        listInteger.render();
        System.out.println("________________Clone mảng________________");
        MyList<Integer> array = new MyList<Integer>();
        array = listInteger.clone();
        array.render();
        System.out.println("________________boolean contain tìm phần tử trong mảng________________");
        System.out.println(array.contains(10));
        System.out.println("________________tìm vitri phần tử________________");
        System.out.println("vị trí = "+array.indexOf(10));
        System.out.println("vị trí = "+array.indexOf(3));

        System.out.println("_______________Clear test_________________");
        array.render();
        array.Clear();
        System.out.println("sau khi clearrrr = ");
        array.render();
        System.out.println("________________OK________________");
    }
}