package sa.searcher.simpleQuery;

import java.util.ArrayList;

import sa.booking.Booking;

public interface IQuery {
	 ArrayList<Booking> search(ArrayList<Booking> bookings);
}
