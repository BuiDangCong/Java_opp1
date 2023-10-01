package Model;

public class Writer {
    private String writerName;
    private Bookdate writerdate;

    public Writer(String writerName, Bookdate writerdate) {
        this.writerName = writerName;
        this.writerdate = writerdate;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public Bookdate getWriterdate() {
        return writerdate;
    }

    public void setWriterdate(Bookdate writerdate) {
        this.writerdate = writerdate;
    }
}
