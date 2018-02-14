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
public class EventDemo {
    	public static void main(String[] args) {
		Event event1 = new Event();
		event1.setGuests(CarlysEventPriceWithMethods.askingNumberGuests());
		event1.setEventNumber(CarlysEventPriceWithMethods.askingEventNumber());
		CarlysEventPriceWithMethods.motto();
		CarlysEventPriceWithMethods.impresionFinal(event1);
	}
}
