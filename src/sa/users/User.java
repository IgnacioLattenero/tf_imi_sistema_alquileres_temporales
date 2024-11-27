package sa.users;

import java.util.ArrayList;
import java.util.List;

import sa.booking.BookedPeriod;
import sa.booking.Booking;
import sa.properties.Rankeable;
import sa.properties.Review;

public abstract class User implements Rankeable {
	protected String fullName;
	protected int telephone;
	protected String mail;
	private List<Review> reviews;

	protected User() {
		
	}
	
	public User(String fullName, int telephone, String mail) {
		this.fullName = fullName;
		this.telephone = telephone;
		this.mail = mail;
		this.reviews = new ArrayList<Review>();
	}
	
	public List<Review> getReviews() {
		return this.reviews;
	}
	
	public abstract void summary();
	
	@Override
	public double getRank() {
		
		
		/**
		 * acá lo mismo que en property.
		 * 
		 * 
		 * */
		return this.getReviews().stream()
								.mapToInt(rewiew -> rewiew.getRating())
								.average()
								.orElse(0.0);

		
	}

	public abstract void reserveCancelled(Booking b, BookedPeriod bp);
		// TODO Auto-generated method stub
}
