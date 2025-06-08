package facade;

public class OrderFacade {

	ProductDAO productDAO;
	Invoice invoice;
	Payment payment;
	SendNotifications sendNotifications;
	public OrderFacade() {
		productDAO = new ProductDAO();
		invoice=new Invoice();
		payment=new Payment();
		sendNotifications=new SendNotifications();
		
		
	}
	public void createOrder() {
		Product product=productDAO.getProduct(1);
		payment.makePayment();
		invoice.generateInvoice();
		sendNotifications.sendNotifications();
	}
}
