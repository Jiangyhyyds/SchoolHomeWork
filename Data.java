package SecondWork.sky.books;

import java.util.ArrayList;

public class Data {
    private static ArrayList<Books> list = new ArrayList<Books>();

    public static int query(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId()))
                return i;
        }
        return -1;
    }

    public static String add(Books book) {
        list.add(book);
        return "添加成功";
    }

    public static String editNum(String id, int num) {
        Books book = list.get(query(id));
        book.setNum(book.getNum() + num);
        return "要添加的图书已经存在，仅更新库存";
    }

    public static String del(String id) {
        list.remove(query(id));
        return "删除成功";
    }

    public static Books show(String id) {
        return list.get(query(id));
    }

    public static void showAll() {
        if (list.size() == 0) {
            System.out.println("库中无任何数据");
            return;
        }
        for (Books book : list) {
            System.out.println(book);
        }
    }

}
