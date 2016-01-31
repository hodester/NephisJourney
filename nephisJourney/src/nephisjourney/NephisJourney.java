/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney;

import nephisJourney.src.model.Location;
import nephisJourney.src.model.Player;
import nephisJourney.src.model.RegularSceneType;
import nephisJourney.src.model.ResourceSceneType;
import nephisJourney.src.model.WarehouseSceneType;
import nephisjourney.src.model.Liahona;
import nephisjourney.src.model.ReferenceMenu;

/**
 *
 * @author Jenaca
 */
public class NephisJourney {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Nephi");
        playerOne.setHighScore(525600);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
      
        Location locationOne = new Location();
        
        locationOne.setRow(1);
        locationOne.setColumn(1);
        locationOne.setVisited(true);
        locationOne.setAmountRemaining(3);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        ResourceSceneType ResourceSceneTypeOne = new ResourceSceneType();
        
        ResourceSceneTypeOne.setRow(2);
        ResourceSceneTypeOne.setColumn(2);
        ResourceSceneTypeOne.setVisited(true);
        ResourceSceneTypeOne.setAmountRemaining(3);
        ResourceSceneTypeOne.setDescription("Lehi's House");
        ResourceSceneTypeOne.setTravelTime(2);
        ResourceSceneTypeOne.setBlocked(true);
        ResourceSceneTypeOne.setAmountAvailable(25);
        ResourceSceneTypeOne.setResourceType("Treasure");
        
        String ResourceSceneTypeInfo = ResourceSceneTypeOne.toString();
        System.out.println(ResourceSceneTypeInfo);
        
        RegularSceneType RegularSceneTypeOne = new RegularSceneType();
        
        RegularSceneTypeOne.setRow(3);
        RegularSceneTypeOne.setColumn(3);
        RegularSceneTypeOne.setVisited(true);
        RegularSceneTypeOne.setAmountRemaining(3);
        RegularSceneTypeOne.setDescription("Promised Land");
        RegularSceneTypeOne.setTravelTime(2);
        RegularSceneTypeOne.setBlocked(true);
        
        String RegularSceneTypeInfo = RegularSceneTypeOne.toString();
        System.out.println(RegularSceneTypeInfo);
        
        WarehouseSceneType WarehouseSceneTypeOne = new WarehouseSceneType();
        
        WarehouseSceneTypeOne.setRow(4);
        WarehouseSceneTypeOne.setColumn(4);
        WarehouseSceneTypeOne.setVisited(true);
        WarehouseSceneTypeOne.setAmountRemaining(3);
        WarehouseSceneTypeOne.setDescription("Lehi's Tent");
        WarehouseSceneTypeOne.setTravelTime(2);
        WarehouseSceneTypeOne.setBlocked(true);
        WarehouseSceneTypeOne.setNoOfItems(1);
        
        String WarehouseSceneTypeInfo = WarehouseSceneTypeOne.toString();
        System.out.println(WarehouseSceneTypeInfo);
        
        ReferenceMenu ReferenceMenuOne = new ReferenceMenu();
        
        ReferenceMenuOne.setName("Scripture Reference for locations visited");
        ReferenceMenuOne.setLocationOneScripture("1 Nephi 1:4");
        
        String LocationOneScripture = ReferenceMenuOne.toString();
        System.out.println(LocationOneScripture);
        
        Liahona LiahonaMenu = new Liahona();
        
        LiahonaMenu.setDescription("Information and Scriptuers about locations");
        LiahonaMenu.setAdditionalInformation("Scriptuer references for locations");
        
        String LiahonaInfo = LiahonaMenu.toString();
        System.out.println(LiahonaInfo);
    }
}
