package packageSets;
import java.util.HashSet;
public class hashsetDemo {
    public static void main(String[] args) {
    HashSet<Student> hashSt = new HashSet<> ();
    Student st= new Student();
    st.NhapThongTin();
    st.ThemSinhVien(hashSt);
    st.SuaThongTin(hashSt);
    st.XoaSinhVien(hashSt);
    st.HienThi(hashSt);
    }
}
