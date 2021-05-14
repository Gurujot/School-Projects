package runCode;

public class ObserverTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare 3 followers first, second, and third
		Follower first = new Follower("FIRST FOLLOWER");
		Follower second = new Follower("SECOND FOLLOWER");
		Follower third = new Follower("THIRD FOLLOWER");
				
		//declare the channel MY CHANNEL
		Channel myChannel = new Channel("MY CHANNEL");
				
		//registerSubscriber methods
		myChannel.registerObserver(first);
		myChannel.registerObserver(second);
				
		//SONG1 is played then first and second follower statuses are also updated
		myChannel.setStatus("SONG1");
		myChannel.notifyObservers();
		first.play();
		second.play();
				
		//unregisterSubscriber second and registerSubcriber third
		myChannel.unregisterObserver(second);
		myChannel.registerObserver(third);
				
		//SONG1 is played then first and second follower statuses are also updated
		myChannel.setStatus("SONG2");
		myChannel.notifyObservers();
		first.play();
		third.play();
	}

}
