public class FictionBook extends Book {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(String bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString()
                +" category: "+category;
    }
}
