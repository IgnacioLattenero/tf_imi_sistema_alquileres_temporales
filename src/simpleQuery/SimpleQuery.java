package simpleQuery;

import java.util.ArrayList;

public abstract class SimpleQuery implements IQuery {
	
	@Override
	public abstract ArrayList<Booking> search(ArrayList<Booking> bookings);
	
	
	
}
