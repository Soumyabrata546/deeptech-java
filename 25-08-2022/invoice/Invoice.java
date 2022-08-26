package Second;

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

