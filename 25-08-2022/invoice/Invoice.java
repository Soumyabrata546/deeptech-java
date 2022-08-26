package Second;
// Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
// An Invoice should include four pieces of information as instance variables‐a part number(type String),a part
// description(type String),a quantity of the item being purchased (type int) and a price per item  (double). Your
// class should have a constructor that initializes the four instance variables. In addition, provide a method named getInvoice Amount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the
// quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a
// test application named InvoiceTest that demonstrates class Invoice’s capabilities.
public class Invoice {
	String part_desc,part_no;
	int quantity;
	double price;
	Invoice(String pno,String part_desc,int quan,double price){
		part_no=pno;
		this.part_desc=part_desc;
		quantity=quan;
		this.price=price;
		if(quantity<0) {
			quantity=0;
		}else if(price<0) {
			price=0.0;
		}
	}
	double getInvoice() {
		return price*quantity;
			
	}
}

