import java.util.ArrayList;
import java.util.List;

public class Account {
    private int soTaiKhoan;
    private String tenChuTaiKhoan;
    private double soDu = 0.0;
    private ArrayList<Transaction> list;

    public Account() {
        list = new ArrayList<>();
    }
    public Account(int soTaiKhoan, String tenChuTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        list = new ArrayList<>();
    }

    public Account(int soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
        list = new ArrayList<>();
    }
    
    public int getSoTaiKhoan() {
        return soTaiKhoan;
    }
    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }
    public double getSoDu() {
        return soDu;
    }
    public void setSoTaiKhoan(int soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }
    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }
    public void setSoDu(double soTien) {
        this.soDu = soTien;
    }
    public void napTien(double soTien) {
        if (soTien <=0) {
            System.out.println("So tien khong hop le!");
        }else {
            soDu += soTien;
            list.add(new Transaction("Nap Tien", soTien));
        }
    }
    public void rutTien(double soTien) {
        if (soTien > soDu || soTien <0){
            System.out.println("So du khong du!");
        }else {
            soDu -= soTien +soTien*(0.5/100);
            list.add(new Transaction("Rut Tien", soTien ));
            System.out.println("Rut thanh cong!");
            System.out.println("So Du: "+soDu);
        }

    }
    public void themGiaoDich(String loaiGiaoDich, double soTien) {
        Transaction transaction = new Transaction(loaiGiaoDich, soTien);
        transaction.thucHienGiaoDich(this);
        
    }

    public void getList() {
        for (Transaction transaction : list) {
            System.out.println(transaction.toString());
        }
    }
    //AI
    public List<Transaction> getGD() {
        return list;
    }
    @Override
    public String toString() {
        return "ID: "+soTaiKhoan+" | Name: "+tenChuTaiKhoan+" | Balance: "+soDu;
    }

}
