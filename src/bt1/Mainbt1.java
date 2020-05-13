/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Administrator
 */
public class Mainbt1 {
    public static void main(String[] args) throws ParseException{
        HoaDonHeader HDH = new HoaDonHeader("HD01",new SimpleDateFormat("dd/mm/yyyy").parse("10/05/2020"),"ĐỖ THỊ THANH THÚY");
        CTHD CTHD1 = new CTHD("Kem nền Skin Aqua",3,100000, (float) 0.5);
        CTHD CTHD2 = new CTHD("Son môi BLACKROUGE",2,150000, (float) 0.8);
        
        HoaDon HD = new HoaDon.Builder()
                .addHoaDonHeader(HDH)
                .addCTHD(CTHD1)
                .addCTHD(CTHD2)
                .build();
       System.out.println(HD.toString());
    }
}


