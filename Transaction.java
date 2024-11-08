import java.util.Date;

public class Transaction implements ITransaction {
    private String loaiGiaoDich;
    private Date ngayDaoDich;
    private double soTien;

    public Transaction() {

    }
    public Transaction(String loaiGiaoDich, double soTien) {
        this.loaiGiaoDich = loaiGiaoDich;
        this.soTien = soTien;
        ngayDaoDich = new Date();
    }

    public String getLoaiGiaoDich() {
        return loaiGiaoDich;
    }
    public void setLoaiGiaoDich(String loaiGiaoDich) {
        this.loaiGiaoDich = loaiGiaoDich;
    }
    public Date getNgayDaoDich() {
        return ngayDaoDich;
    }
    public void setNgayDaoDich(Date ngayDaoDich) {
        this.ngayDaoDich = ngayDaoDich;
    }
    public double getSoTien() {
        return soTien;
    }
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    @Override
    public double phiGiaoDich() {
        return soTien*(0.5/100);
    }
    @Override
    public void thucHienGiaoDich(Account account) {
        if (loaiGiaoDich == "Rut Tien") {
            account.rutTien(soTien);
        }else if(loaiGiaoDich == "Nap Tien"){
            account.napTien(soTien);
        }
    }
    @Override
    public String toString() {
        return "Transaction: "+ loaiGiaoDich+" | So Tien: "+soTien+" | Date: "+ngayDaoDich;
    }
}
