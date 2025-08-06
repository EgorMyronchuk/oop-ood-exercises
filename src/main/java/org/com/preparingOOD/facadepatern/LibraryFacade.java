package org.com.preparingOOD.facadepatern;

public class LibraryFacade {
    private BookInventory bookInventory ;
    private ReservationService reservationService;
    private NotificationService notificationService ;

    public LibraryFacade() {
        this.bookInventory = new BookInventory();
        this.reservationService = new ReservationService(); ;
        this.notificationService = new NotificationService(); ;
    }

    public void buyBook( ){
        bookInventory.findBook();
        reservationService.reserveBook();
        notificationService.notificationUser();
        System.out.println("You bought a book");
    }
}
