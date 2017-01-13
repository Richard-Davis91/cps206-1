package chatServer.direct;

import chatServer.user.User;

import java.util.Date;

public class Direct {

	private final User from;
	private final User to;
	private final Date timeStamp;
	private final String message;
	private boolean pending;
	private boolean messageTruncated;

	private Direct(){
		this.from = null;
		this.to = null;
		this.timeStamp = null;
		this.message = null;
		this.pending = false;
		this.messageTruncated = false;

	}

	public Direct(User from, User to, Message message){
		this.from = from;
		this.to = to;
		this.timeStamp = new Date();
		this.pending = true;

	}

	public User getFrom(){ return from; }

	public User getTo(){ return to; }

	public String getMessage(){ return null; }

	public boolean isPending(){ return pending; }

	public void messageHasBeenSent(){ this.pending = false; }


	public Date getTimeStamp(){ return timeStamp; }

	public String toString(){
		return "";
	}

	/* tests */
	public static void main(String... args){
		User from = new User("from");
		User to = new User("to");
		String message = "test message";


		Direct directRegular = new Direct(from, to, message);
		Direct directLong = new Direct(from, to, longMessage);

		assert directRegular.getFrom() == from : "getFrom does not return from";
		assert directRegular.getTo() == to : "getTo does not return to";
		assert directRegular.getMessage().equals(message) : "get message under normal conditions does not return message";
		assert directRegular.isPending() : "isPending returns false when pending";
		directRegular.messageHasBeenSent();
		assert !directRegular.isPending() : "message has been sent but still is pending";

		assert directRegular.getTimeStamp() != null : "timestamp is returning null";

		assert directRegular.toString().equals(from.toString() + " >> " + to.toString() + "\n" + directRegular.getTimeStamp().toString
						() + ": " + message) : "toString method doesn't match";


		assert directLong.getMessage().length() == 2048 + "...".length() : "long message length isnt valid";
	}
}