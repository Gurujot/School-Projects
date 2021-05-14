package runCode;

public class Follower implements Observer, PlayChannel {
	    //private attributes
		private String followerName;
		private String status;
		
		//constructor
		public Follower(String followerName) {
			this.followerName = followerName;
		}
		
		//getFollowerName method
		public String getFollowerName() {
			return followerName;
		}
		
		//setFollowerName method
		private void setFollowerName(String followerName) {
			this.followerName = followerName;
		}
		
		@Override
		//update method
		public void update(String status) {
			this.status = status;
			//play();
		}
		
		@Override
		//play method
		public void play() {
			System.out.println("Now playing: NEW " + this.status +"... for " + getFollowerName());
		}
		
		public String toString() {
			return "This is "+getFollowerName();
		}
}
