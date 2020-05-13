/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Administrator
 */
public class Mainbt2 {
    
    public static void main(String[] args)
    {
      MyStringBuilder str = new MyStringBuilder.Builder()
                .addString("Đỗ Thị Thanh Thúy: ")
                .addFloat((float)15.6)
                .addBool(true)
                .Builder();
      System.out.println("\n" + str.toString());
    }
}
