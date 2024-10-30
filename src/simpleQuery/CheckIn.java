package simpleQuery;

import java.time.LocalDate;
import java.util.ArrayList;


public class CheckIn extends SimpleQuery{
	
	private LocalDate date;

	public CheckIn(LocalDate date) {
		this.date = date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
		
	}

	public LocalDate getDate() {
		return this.date;
	}

	@Override
	public ArrayList<Booking> search(ArrayList<Booking> bookings) {
		ArrayList<Booking> aux = new ArrayList<Booking>();
		for(int i=0;i<bookings.size();i++) {
			if(this.date.isAfter(bookings.get(i).getCheckIn()) || this.date.isEqual(bookings.get(i).getCheckIn())) {
				aux.add(bookings.get(i));
			}
		}
		return aux;
	}


	

	
	

}
