package tinhLuong;

public class nhanvien {
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
        return" ";
    }
    public void xuatThongTin(){
        System.out.println("thong tin nhan vien: "+fullName+"\n"+loaiNhanVien()+"\ntien luong: "+luong);
    }
}
