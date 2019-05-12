package unit6.entity;

public class Book {
    private String title;
    private int pageSize;

    public Book(String title, int pageSize) {
        this.title = title;
        this.pageSize = pageSize;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
