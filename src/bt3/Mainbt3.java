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
public class Mainbt3 {
    public static void main(String[] args)
    {
        ShapeFactory shapeFac = new ShapeFactory();
        Shape h1 = shapeFac.createShape(ShapeType.Rectangle);
        Shape h2 = shapeFac.createShape(ShapeType.Triangle);
        Shape h3 = shapeFac.createShape(ShapeType.Circle);
        
        h1.setBrush(": Brush: Bàn chải,");
        h1.setFrame(": Frame: Khung gỗ,");
        h1.setPaper("Paper: Giấy A4");
        System.out.println(h1.draw()+h1.getBrush()+ h1.getFrame() +h1.getPaper());
        
        h2.setBrush(": Brush: Bút chì,");
        h2.setFrame(": Frame: Khung tranh,");
        h2.setPaper("Paper: Giấy cứng");
        System.out.println(h2.draw()+h2.getBrush()+ h2.getFrame() +h2.getPaper());
        
        h3.setBrush(": Brush: Bút lông,");
        h3.setFrame(": Frame: Khung nhựa,");
        h3.setPaper("Paper: Giấy vệ sinh");
        System.out.println(h3.draw()+h3.getBrush()+ h3.getFrame() +h3.getPaper());
    }
        
}
