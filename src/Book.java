public class Book {
    //khai báo thuộc tính
    //<kiểu dữ liệu><tên thuộc tính>
    String code;
    String name;
    int price;
    String author;

    // thuộc tính mà tất cả các đối tượng chung
    static String source="tiki";

    //constructor: phương thức khởi tạo
    //không có dữ liệu trả về
    //chỉ ra cách tạo mới đối tượng


    public Book() {
    }

    public Book(String code) {
        this.code = code;
    }
    public Book(String code, String name, int price, String author) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.author = author;
    }


    //get+Tên thuộc tính
    //kiểu dữ liệu trả về là kiểu dữ liệu của thuộc tính
    //phương thức get la phương thức trả về dữ liệu
    public String getCode() {
        return code;
    }

    //set+tên thuộc tính
    //kiểu void: không có dữ liệu trả về
    // tham số: cùng kiểu dữ liêuj với thuộc tính
    public void setCode(String code) {
      // this là chỉ đến đối tượng hiện tại
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void m1(){
        System.out.println("Tao la m1");
    }

    void m1(String a){

    }
}
