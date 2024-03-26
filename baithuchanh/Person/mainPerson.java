package Person;
import Person.Employee;
import Person.EmployeeFulltime;
import Person.EmployeeParttime;
public class mainPerson {
    public static void main(String[] args) {
        EmployeeFulltime fulltime = new EmployeeFulltime();
        fulltime.nhapthongtin();
        fulltime.age(18);
        fulltime.kinhnghiem();
        fulltime.tinhluong();
        fulltime.xuatthongtin();
        fulltime.xuatluong();
        EmployeeParttime parttime = new EmployeeParttime();
        parttime.nhapthongtin();
        parttime.age(23);
        parttime.kinhnghiem();
        parttime.tinhluong();
        parttime.xuatthongtin();
        parttime.xuatluong();
    }
}
