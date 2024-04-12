package slide71;

public class classHinhtron {
    private final float PI =3.14f;
    private float banKinh;
    public float getBankinh(){
        return banKinh;
    }
   public void setBankinh(float banKinh){
    this.banKinh=banKinh;
   }
   public float tinhChuvi(){
    return 2*PI*banKinh;
   }
   public float tinhDientich(){
    return PI*banKinh*banKinh;
   }
}
