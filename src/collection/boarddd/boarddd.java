package collection.boarddd;

public class boarddd {
    private int bno;
    private String bwriter;
    private String bdate;
    private String btitle;
    private String bcontent;

    public boarddd(int bno, String bwriter, String bdate, String btitle, String bcontent) {
        this.bno = bno;
        this.bwriter = bwriter;
        this.bdate = bdate;
        this.btitle = btitle;
        this.bcontent = bcontent;
    }


    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    @Override
    public String toString() {
        return "boarddd{" +
                "bno=" + bno +
                ", bwriter='" + bwriter + '\'' +
                ", bdate='" + bdate + '\'' +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                '}';
    }
}
