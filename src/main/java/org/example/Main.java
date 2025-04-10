package org.example;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    // create a list data of object
    List<Human> listHuman = List.of(
        new Human("Phuoc","huuphuoc@gmail.com","0962616491","HCM"),
        new Human("Minh","minh@gmail.com","023131244","HCM"),
        new Human("Linh","linh@gmail.com","0127946185","HCM"),
        new Human("My","my@gmail.com","0276154244","HCM"),
        new Human("Linh","linh@gmail.com","0127946185","HCM")
        );
    // create new list to map data filtered
    List<Human> listFilter =
    listHuman.stream().filter(humans -> humans.getEmail().startsWith("m") ).collect(Collectors.toList());
    listFilter.forEach(System.out::println);
    // trong stream có 3 thành phần đầu, thân, và kết thúc.
    // phần đầu bao gồm stream() phần thân là các logic và sử lý filter,map,sort... và phânf cuối Collect,forEch,count...

    System.out.println("------------------------------------------------------------- sắp xếp theo tên A-Z");
    List<Human> sortFilter = listHuman.stream().sorted(Comparator.comparing(Human::getName)).collect(Collectors.toList());
    sortFilter.forEach(System.out::println);

    // phải override equals cũng như hashCode bởi vì khi new đối tượng nó sẽ có địa chỉ ô nhớ khác nhau vì vậy nó sẽ kiểm tra khác địa chỉ (stack)
    System.out.println("------------------------------------------------------------- bỏ các trùng lặp");
    List<Human> distinct = listHuman.stream().distinct().collect(Collectors.toList());
    distinct.forEach(System.out::println);
  }
}
