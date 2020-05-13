/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class HoaDonHeader {
    String mahoadon;
    Date ngayban;
    String tenkhachhang;
    
    public HoaDonHeader()
    {
    }
    public HoaDonHeader(String mahoadon, Date ngayban, String tenkhachhang)
    {
        this.mahoadon = mahoadon;
        this.ngayban = ngayban;
        this.tenkhachhang = tenkhachhang;
    }
    public String getmahoadon()
    {
        return mahoadon;
    }
    public void setmahoadon(String mahoadon)
    {
        this.mahoadon = mahoadon;
    }
    public Date getngayban()
    {
        return ngayban;
    }
    public void setngayban(Date ngayban)
    {
        this.ngayban = ngayban;
    }
    public String gettenkhachhang()
    {
        return tenkhachhang;
    }
    public void settenkhachhang(String tenkhachhang)
    {
        this.tenkhachhang = tenkhachhang;
    }
    @Override
    public String toString()
    {
        return "Hóa đơn:"+"\n"+" Mã hóa đơn :" +mahoadon +"\n"+"Ngày bán:" +ngayban +"\n"+"Tên khách hàng:" +tenkhachhang;
    }
}
