import java.util.ArrayList;

public class BankManagement {
    private ArrayList<Account> listAcc;

    public BankManagement() {
        listAcc = new ArrayList<>();
    }

    public void themAcc(Account account) {
        listAcc.add(account);
    }
    
    public Account timAcc(int id) {
        for (Account account : listAcc) {
            if (account.getSoTaiKhoan() == id){
                return account;
            }
        }
        return null;//?
    }

    public void xoaAcc(int id) {
        Account account = timAcc(id);
        listAcc.remove(account);
    }

    public void suaAcc(Account account, int id, String name, double soDu) {
        account.setSoTaiKhoan(id);
        account.setTenChuTaiKhoan(name);
        account.setSoDu(soDu);
    }

    public void themGD(int id, String loaiGD, double soTien) {
        Account account = timAcc(id);
        if (account != null) {
            account.themGiaoDich(loaiGD, soTien);
        }
    }

    public void danhSachAcc() {
        for (Account acc : listAcc) {
            System.out.println(acc.toString());
        }
    }
//AI
    public void lichSuGD(int id) {
        Account account = timAcc(id);
        if (account != null){
            for (Transaction transaction : account.getGD()) {
                System.out.println(transaction);
            }
        }

    }
}
