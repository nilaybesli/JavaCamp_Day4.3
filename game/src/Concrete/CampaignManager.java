package Concrete;

import Abstracts.CampaignService;
import Entities.Campaign;
import Entities.User;

public class CampaignManager implements CampaignService {
	
	public void addCampaign(User user, Campaign campaign) {
        System.out.println("Kampanya eklendi : " +campaign.getCampaignName());

	}

	

	public void deleteCampaign(Campaign campaign) {
        System.out.println("Kampanya silindi : " +campaign.getCampaignName());

	}
	
	public void updateCampaign(Campaign campaign) {
        System.out.println("Kampanya guncellendi : " +campaign.getCampaignName());

	}



	@Override
	public void addCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}
}
