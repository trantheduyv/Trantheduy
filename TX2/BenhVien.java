package QLBV;

public class BenhVien {
    private String tenBV;
    private String diaChi;
    private String giamDoc;

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    public String getTenBV() {
        return tenBV;
    }

    public void setTenBV(String tenBV) {
        this.tenBV = tenBV;
    }
    public BenhVien(){}
    public BenhVien(String ten, String gd, String dc){
        this.tenBV=ten;
        this.giamDoc=gd;
        this.diaChi=dc;
    }

    @Override
    public String toString() {
        return tenBV+"\t"+giamDoc+"\t"+diaChi+"\t";
    }
}
