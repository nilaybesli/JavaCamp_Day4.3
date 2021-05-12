package game;

import java.time.LocalDate;
import Abstracts.UserCheckService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;
import game.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) throws Exception {
				User user = new User();
				user.setName("Nilay");
				user.setLastName("Besli");
				user.dateOfBirth= LocalDate.of(2001,3,19); 
				user.setNationalityId("294");

				User user1 = new User();
				user1.setName("Duygu ");
				user1.setLastName("Orhan");
				user1.dateOfBirth= LocalDate.of(2001,1,30); 
				user1.setNationalityId("213");
				
				// KAMPANYA EKLEME
				Campaign campaign = new Campaign();
				campaign.setCampaignName("Ilk alisverise %20 indirim");
				Campaign campaign1 = new Campaign();
				campaign1.setCampaignName("Ramazana Ozel (%50) Indirim");
				Campaign campaign2 = new Campaign();
				campaign2.setCampaignName("Ilk alisverise %30 indirim");			
				// OYUN EKLEME	
				Game game=new Game(1,"PUBG",50,"Mobile-Game");
		        Game game2=new Game(2,"Mobile legends",100,"Mobile-Game");
		        Game game3=new Game(3,"VALORANT",200,"Video-Game");
				////////////////////////////////////////////////////////
				
				//OYUNCU KAYIT-GÜNCELLEME-SILME
				UserManager userManager = new UserManager(new MernisServiceAdapter());
				userManager.addUser(user1);
				userManager.deleteUser(user1);
				userManager.updateUser(user);
				System.out.println("************************\n");	

				
				CampaignManager campaignManager = new CampaignManager();
				campaignManager.addCampaign(user, campaign);
				campaignManager.addCampaign(user, campaign1);
				campaignManager.deleteCampaign(campaign1);
				campaignManager.updateCampaign(campaign2);
				System.out.println("************************\n");	
		

				GameManager gameManager = new GameManager(new MernisServiceAdapter());
				gameManager.Add(user, game);
				gameManager.Add(user, game2);
				gameManager.Add(user1, game3);
				System.out.println("\n");

				
				SaleManager saleManager = new SaleManager();
				saleManager.Sell(user1, game3);
				System.out.println("\n");
				saleManager.sellWithCampaign(game2, user, campaign2);
			}
}