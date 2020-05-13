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
public class Triangle extends Shape{
    private static Triangle instance;

    static Shape createTriangle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Triangle()
    {
        
    }
    public static Triangle createShape()
    {
        if (instance == null)
        {
            instance = new  Triangle();
        }
        return instance;
    }
    @Override
    public String draw()
    {
        return" Vẽ một hình chữ nhật "+
                "(bút: " + this.Brush +")"+
                "(giấy:" + this.Paper +")"+
                "(Khung:"+ this.Frame +")";
    }
    
    
}
