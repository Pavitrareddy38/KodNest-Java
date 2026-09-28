
public class Book {

    private int pageNum;

    public void setData(int p) {
        if (p > 0) {
            pageNum = p;
        }
    }

    public int getData() {
        return pageNum;
    }
}
