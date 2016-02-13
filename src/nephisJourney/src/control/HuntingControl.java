/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.control;

/**
 *
 * @author Adam
 */
public class HuntingControl {
    
    
    
    public static void main(String[] args){
        
        String Hunt;
        int random = (int ) (Math.random() * 135 + 1);
        
        
        if (random >=5 && random <=15){
            Hunt = "You hunted a Hyrax that weighed "+ random + "lbs!";
        } 
        else if (random >=40 && random <=80){
            Hunt = "You hunted a Gray Wolf that weighed "+ random + "lbs!";
        }
        else if (random >=100 && random <=120){
            Hunt = "You hunted a Arabian Oryx that weighed "+ random + "lbs!";
        }
        else{
            Hunt = "Hunt failed!";
        }
        System.out.println(Hunt);
    }    


         
}
