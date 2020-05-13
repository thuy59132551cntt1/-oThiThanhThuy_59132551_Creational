/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class HoaDon {
    HoaDonHeader Hearder ;
    ArrayList<CTHD> DSCTHD = new ArrayList<>();
    
    protected HoaDon(Builder builder){
        this.Hearder = builder.Hearder;
        this.DSCTHD = builder.DSCTHD;
    }
    @Override
    public String toString()
    {
        String ht = Hearder.toString();
        for (int i = 0; i<DSCTHD.size(); i++)
        {
            ht += DSCTHD.get(i).toSring();
        }
        return ht;
    }
    public static class Builder{
        HoaDonHeader Hearder;
        ArrayList<CTHD> DSCHD = new ArrayList<>();
        private ArrayList<CTHD> DSCTHD;
        public String str;
        
        public Builder()
        {
            
        }
        public Builder addHoaDonHeader(HoaDonHeader Hearder)
        {
            this.Hearder = Hearder;
            return this;
        }
        public Builder addCTHD(CTHD cthd)
        {
            this.DSCTHD.add(cthd);
            return this;
        }
        public HoaDon build()
        {
            return new HoaDon(this);
        }

    }
}