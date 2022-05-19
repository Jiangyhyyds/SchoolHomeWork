package SecondWork.sky.books;

public class Books {
    private String id, name, author;
    private int num;

    public Books() {

    }

    public Books(String id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public boolean checkID(String id) {
        char first = id.charAt(0);
        return Character.isLetter(first) && id.length() == 6;
    }

    public String add() {
        if (Data.query(id) == -1) {
            return Data.add(this);
        }
        else {
            return Data.editNum(id, num);
        }
    }

    public static void show(String id) {
        if (Data.query(id) == -1) {
            System.out.println("要查询的编号不存在");
        }
        else {
            System.out.println(Data.show(id));
        }
    }

    public static void showAll() {
        Data.showAll();
    }

    public static String del(String id) {
        if (Data.query(id) == -1) {
            return "要查询的数据不存在";
        }
        else {
            return Data.del(id);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "编号：" + this.getId() + " 书名：" + this.getName() + " 作者：" + this.getAuthor() + " 库存：" + this.getNum();
    }
}
