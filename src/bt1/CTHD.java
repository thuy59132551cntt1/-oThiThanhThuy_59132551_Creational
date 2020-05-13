/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Administrator
 */
public class CTHD {
    String Sanpham;
    int soluong;
    double dongia;
    float chietkhau;
    
        public CTHD(String Sanpham, int soluong, double dongia, float chietkhau)
        {  
            this.Sanpham = Sanpham;
            this.soluong = soluong;
            this.dongia = dongia;
            this.chietkhau = chietkhau;
        }
   
    public String getSanpham(){
        return Sanpham;
}
    public void setSanpham(String Sanpham)
    {
        this.Sanpham = Sanpham;
    }
    public int getsoluong()
    {
        return soluong;
    }
    public void setsoluong(int soluong)
    {
        this.soluong = soluong;
    }
    public double getchietkhau()
    {
        return chietkhau;
    }
    
    public void setchietkhau(double chietkhau)
    {
        this.chietkhau = (float) chietkhau;
    }
   public String toSring()
   {
       return "\n Chi tiet hoa don{"+ "Sản phẩm:" + Sanpham +",Số lượng:" + soluong+", Đơn giá:"+ dongia+", Chiết khấu:"+ chietkhau+'}';
   }
    
}