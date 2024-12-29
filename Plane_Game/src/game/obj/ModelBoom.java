/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.obj;

public class ModelBoom {
    
    public double getSize(){
        return size;
    }
    
    public void setSize(double size){
        this.size= size;
    }
    
    public float getAngle(){
        return angle;
    }
    
    public void setAngle(float angle){
        this.angle= angle;
    }
    
    public ModelBoom(double size, float angle){
        this.size= size;
        this.angle= angle;
    }
    
    public ModelBoom(){
        
    }
    
    private double size;
    private float angle;
}
