package Concrete;

import Abstracts.GameService;
import Entities.Game;
import Entities.User;
import game.MernisServiceAdapter;

public class GameManager implements GameService{
	public GameManager(MernisServiceAdapter mernisServiceAdapter) {

    }

    
    public void Add(User user, Game game) {
        System.out.println("Game Added : " +game.getGameName());
    }

    
    public void Delete(Game game) {
        System.out.println("Game Deleted : " +game.getGameName());
    }

    
    public void Update(Game game) {
        System.out.println("Game Updated : " +game.getGameName());
    }


	@Override
	public void Add(Game game) {
		// TODO Auto-generated method stub
		
	}
}
