package day16.model.dto;

public class BoardDto {
    // 1. 멤버변수
    private String btitle;
    private String  bcontent;
    private String  bdate;
    private int  bview;
    private int  mno;
    private int  bno;
    // 2. 생성자
    public BoardDto(){}
    public BoardDto(String btitle, String bcontent, String bdate, int bview, int mno, int bno) {
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bdate = bdate;
        this.bview = bview;
        this.mno = mno;
        this.bno = bno;
    }
    // 3. 메소드
        // 1. setter , getter
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

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public int getBview() {
        return bview;
    }

    public void setBview(int bview) {
        this.bview = bview;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    // 2. toString
    @Override
    public String toString() {
        return "BoardDto{" +
                "btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bdate='" + bdate + '\'' +
                ", bview=" + bview +
                ", mno=" + mno +
                ", bno=" + bno +
                '}';
    }
}
