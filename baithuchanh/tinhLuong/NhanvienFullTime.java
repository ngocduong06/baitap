package tinhLuong;

public class NhanvienFullTime extends nhanvien {
    private int ngayLamThem;
    private int loaiChucvu;
    public NhanvienFullTime(String fullName){
        this.fullName=fullName;
    }
    public NhanvienFullTime(String fullName,int ngayLamThem){
        this.fullName=fullName;
        this.ngayLamThem=ngayLamThem;
    }
    public void setLoaiChucVu(int loaiChucvu){
        this.loaiChucvu=loaiChucvu;
        if(loaiChucvu==1){
    System.out.println("\n chuc vu Sep");
        } else System.out.println("\n chuc vu Nhan vien");
    }
    @Override
    public String loaiNhanVien(){
        return "day la nhan vien fulltime";
    }
   public void tinhLuong(){
    if(loaiChucvu==0){
        if(ngayLamThem>0){
            luong=configs.luongnhanvienFullTimeLinh+(configs.luongLamThemmoingay*ngayLamThem);
        } else luong=configs.luongnhanvienFullTimeLinh;
    } else if(ngayLamThem>0){
     luong=configs.luongnhanvienFullTimeSep+(configs.luongLamThemmoingay*ngayLamThem);
    }else luong=configs.luongnhanvienFullTimeSep;
   }
}
