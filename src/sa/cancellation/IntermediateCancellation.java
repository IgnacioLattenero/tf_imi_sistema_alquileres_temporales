package sa.cancellation;

import java.time.LocalDate;

import sa.booking.Booking;

public class IntermediateCancellation implements ICancellationPolicy{

	private LocalDate date;
	@Override
	public void activate(Booking booking) {
		/*
		 * Este metodo se encarga de verificar la fecha de cancelacion del booking con la fecha de activacion de la politica
		 * Si la fecha de cancelacion es 20 dias previa, no se paga nada y se lo notifica en pantalla
		 * Si es 10 dias previa, se paga la mitad del precio
		 * Y si no es ninguna de las 2, se paga todo 
		 * */
		if(this.date.plusDays(20).isBefore(booking.getCheckIn())) {
			System.out.println("No pagas nada");
			//this.date.plusDays(19).isAfter(booking.getCheckIn()) 
		}else if(this.date.plusDays(10).isBefore(booking.getCheckIn())) {
			System.out.println("Se paga la mitad "+booking.price(booking.getCheckIn())/2);
		}else {
			System.out.println("Se paga todo "+booking.price(booking.getCheckIn()));
		}
	}
	public void setDate(LocalDate date) {
		// TODO Auto-generated method stub
		this.date = date;
		
	}
	
	public LocalDate getDate() {
		return this.date;
	}

}
