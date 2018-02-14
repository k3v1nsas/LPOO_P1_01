/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_3;

/**
 *
 * @author SERGIO
 */
public class Event {
    public static final Integer PRIZEPERGUEST = 35;
	public static final Integer LARGEEVENT = 50;
	private String eventNumber;
	private Integer numberOfGuests;
	private Double price;
	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}
	public void setGuests(Integer guests) {
		this.numberOfGuests = guests;
		price = (double)numberOfGuests*PRIZEPERGUEST;
	}
	public String getEventNumber() {
		return eventNumber;
	}
	public Integer getNumberOfGuests() {
		return numberOfGuests;
	}
	public Double getPrice() {
		return price;
	}
}
