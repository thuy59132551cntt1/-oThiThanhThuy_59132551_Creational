/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author Administrator
 */
public class Circle extends Shape{

    static Shape createCircle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Circle()
    {
        Brush +="Vẽ hình tròn:\n";
    }
    public String Draw()
    {
        Brush +="Brush: Bàn chải \n";
        Paper +=" Paper: Giấy vệ sinh\n";
        Frame +="Frame: Khung nhựa";
        return Brush + Paper+ Frame;
    }

    @Override
    public String draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
