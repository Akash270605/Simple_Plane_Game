/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.obj;

public class HP {
    
    public double getMAX_HP(){
        return MAX_HP;
    }
    
    public void setMAX_HP(double MAX_HP){
        this.MAX_HP= MAX_HP;
    }
    
    public double getCurrentHp(){
        return currentHp;
    }
    
    public void setCurrentHp(double currentHp){
        this.currentHp= currentHp;
    }
    
    public HP(double MAX_HP, double currentHp){
        this.MAX_HP= MAX_HP;
        this.currentHp= currentHp;
    }
    
    public HP(){
        
    }
    
    double MAX_HP;
    double currentHp;
}
