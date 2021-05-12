package Concrete;

import Abstracts.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService{
	 public void Sell(User user, Game game) {

	        System.out.println("User : "+user.getName()+ " " +user.getLastName());
	        System.out.println("Game : " + game.getGameName());
	        System.out.println("Price : " +game.getPrice());
	        System.out.println("Satis gerceklesti!");

	    }

	 public void sellWithCampaign(Game game, User user, Campaign campaign) {
	        System.out.println("User : "+user.getName()+ " " +user.getLastName());
	        System.out.println("Game : " + game.getGameName());
	        System.out.println("Price With Campaign : " + (game.getPrice()-campaign.getDiscount()));
	        System.out.println("Used :" +campaign.getCampaignName());

	    }
}
