package runCode;

import java.util.ArrayList;

public class Channel implements Subject {
	//private attributes
		private ArrayList<Observer> observers;
		private String channelName;
		private String status;
		
		//default constructor
		public Channel(String channelName) {
			observers = new ArrayList<Observer>();
			this.channelName = channelName;
		}
		
		//getChannelName method
		public String getChannelName() {
			return this.channelName;
		}
		
		//setChannelName method
		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}
		
		//setStatus method
		public void setStatus(String status) {
			this.status = status;
			statusChanged();
		}
		
		@Override
		//notifyObserversmethod
		public void notifyObservers() {
			for (int i=0; i<observers.size(); i++) {
				Observer observer = (Observer)observers.get(i);
				observer.update(status);
			}
		}
		
		//statusChanged() method
		public void statusChanged() {
			notifyObservers();
		}

		@Override
		public void registerObserver(Observer o) {
			// TODO Auto-generated method stub
			observers.add(o);
			System.out.println("You ("+ ((Follower) o).getFollowerName() + ") are succesfully subscribed to " + getChannelName());
		}

		@Override
		public void unregisterObserver(Observer o) {
			// TODO Auto-generated method stub
			int i = observers.indexOf(o);
			if (i>=0) {
				observers.remove(i);
				System.out.println("You ("+ ((Follower) o).getFollowerName() + ") are succesfully unsubscribed from " + getChannelName());

			}
		}
}
