package SecondWork;
import SecondWork.sky.books.Books;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean type = true;
        while (type) {
            System.out.print("1--添加 2--删除 3--查询 4--显示全部 5--退出 请选择：");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("输入编号，书名，作者，数量（空格分隔）");
                    Books book = new Books();
                    String id = sc.next();
                    if (book.checkID(id)) {
                        book.setId(id);
                        book.setName(sc.next());
                        book.setAuthor(sc.next());
                        book.setNum(sc.nextInt());
                    } else {
                        System.out.println("输入编号有误");
                        sc.next();
                        sc.next();
                        sc.next();
                        continue;
                    }
                    System.out.println(book.add());
                    break;
                case 2:
                    System.out.print("输入要删除的编号：");
                    System.out.println(Books.del(sc.next()));
                    break;
                case 3:
                    System.out.print("输入要查询的编号：");
                    Books.show(sc.next());
                    break;
                case 4:
                    Books.showAll();
                    break;
                case 5:
                    type = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
        sc.close();
    }
}
