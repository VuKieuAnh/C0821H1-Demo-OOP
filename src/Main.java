public class Main {
    public static void main(String[] args) {
        //tạo mới đối tượng
        //<tên của lớp> tên của biến = new gọi hàm khởi tạo;
        Book a1 = new Book("KA01", "Cach ta nghi", 105, "tg2");
        Book a2 = new Book("KA02", "Luat tam thuc", 300, "TG1");
        Book a3 = new Book("KA01", "Di tim le song", 75, "Tg03");
        Book list[]= {a1, a2, a3 };
        int sum =0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i].getPrice();
        }
        System.out.println(Book.source);
//        System.out.println(Book.getPrice());
        Book.source="Fahasa";
        System.out.println(Book.source);

    }
}
