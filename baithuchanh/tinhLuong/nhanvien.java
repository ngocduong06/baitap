package tinhLuong;

public class nhanvien {
    String loaiNhanVien;
    protected  String fullName;
    protected  long luong;
    public nhanvien(){
        fullName="";
        luong=0;
    }
    public nhanvien(String fullName){
    this.fullName=fullName;
    }
    protected String loaiNhanVien(){
        return "";
    };
    public void xuatThongTin(){
        System.out.println("thong tin nhan vien: "+fullName+" chuc vu: "+loaiNhanVien+" tien luong: "+luong);
    }
}
