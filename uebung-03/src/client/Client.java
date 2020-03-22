package client;

public class Client implements IClient {

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void playGame() {
		//when the server confirms the start, take the guesses and count the tries
	}

	@Override
	public void endGame(String message) {
		//show the server message and end the game 
	}


	public static void main(String[] args) {
		//locally: create a server
		//while the user wishes
			//create a game
			//start the game
		//ask for a possible next game
	}

}
