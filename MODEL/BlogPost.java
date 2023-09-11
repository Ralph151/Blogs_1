import java.io.Serializable;

public class BlogPost extends BaseEntity implements Serializable
{
    protected String author;
    protected String title;
    protected String content;
    protected long date;

    public BlogPost(String idFs) {
        super(idFs);
    }
}
