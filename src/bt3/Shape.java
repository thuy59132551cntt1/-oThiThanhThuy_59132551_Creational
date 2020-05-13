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
public abstract class Shape {
    String Brush;
    String Paper;
    String Frame;
    
    public abstract String draw();
    public String getBrush()
    {
        return Brush;
    }
    public String getPaper()
    {
        return Paper;
        
    }
    public String getFrame()
    {
        return Frame;
    }
    public void setBrush(String brush)
    {
        this.Brush = brush;
    }
    public void setPaper(String paper)
    {
        this.Paper = paper;
    }
    public void setFrame(String frame)
    {
        this.Frame = frame;
    }
}
