import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static int binarySearch(Book[] books,int length, String string){
        int right = length -1;
        int left = 0;
        while (right>=left){
            int mid = left+(right -left)/2;
            if(books[mid].getName().compareTo(string)==0){
                return books[mid].getPrice();
            }
            if(books[mid].getName().compareTo(string)>0){
                right = mid -1;
            }
            if(books[mid].getName().compareTo(string)<0){
                left = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Book[] books = buildArrayBook();
        Scanner scanner =new Scanner(System.in);
        Arrays.sort(books,(a,b) -> a.getName().compareTo(b.getName()));
        System.out.println(Arrays.toString(books));
        System.out.println("moi nhap ten sach:");
        String nameBook = scanner.nextLine();


        int price =binarySearch(books,books.length,nameBook);
        if(price ==-1){
            System.out.println("khong tim thay cuon sach");
        }else {
            System.out.println("gia cuon sach la"+price);
        }
    }
    public static Book[] buildArrayBook(){
        Book[] books = new Book[10];
        books[0] = new FictionBook("a1","Tieng qua reo noi vong hon",20000,"Nguyen Ngoc Ngan","truyen ma");
        books[1] = new FictionBook("a2","Bong ma ben cua so",40000,"Nguyen Ngoc Ngan","truyen ma");
        books[2] = new FictionBook("a3","Can nha so 24",50000,"Nguyen Ngoc Ngan","truyen ma");
        books[3] = new FictionBook("a4","Lan va Diep",70000,"Nguyen Ngoc Ngan","truyen tinh");
        books[4] = new FictionBook("a5","Ban tay an trom",100000,"Nguyen Ngoc Ngan","truyen ma");
        books[5] = new ProgrammingBook("j1","Newbie",1000000,"Nguyen Thi Kieu Anh","java","JSF");
        books[6] = new ProgrammingBook("j2","Master",1000000,"Nguyen Thi Kieu Anh","java","JSF");
        books[7] = new ProgrammingBook("j3","Challenge",1000000,"Nguyen Thi Kieu Anh","python","JSF");
        books[8] = new ProgrammingBook("j4","Loser",1000000,"Nguyen Thi Kieu Anh","javaScript","JSF");
        books[9] = new ProgrammingBook("j5","Normal",1000000,"Nguyen Thi Kieu Anh","C","JSF");
        return books;
    }

}
