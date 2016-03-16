package nephisJourney.src.control;

import java.util.ArrayList;
import java.util.Random;
import nephisJourney.NephisJourney;
import nephisJourney.src.view.HuntWithBowView;

/**
 *
 * @author Adam
 */
public class HuntingControl extends HuntWithBowView {
   

    static String Hunt;
       static int random = (int ) (Math.random()*135 + 1);

    
    public static void main(String[] args){                 
               
        if (random >=5 && random <=25){
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
    public static void totalWeight(){
        ArrayList<Integer> array = new ArrayList<>();
        int w;
        int sum = 0;
        for(int i = 0; i<100; i++)
        {
            w = random;
            array.add(w);
            sum =w;
        }
        System.out.println("You have collected " + sum + " lbs!");
        
    }    

    }
        

