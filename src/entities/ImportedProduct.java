package entities;

public class ImportedProduct extends Product {
	
	private Double custonFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double custonFee) {
		super(name, price);
		this.custonFee = custonFee;
	}

	public Double getCustonFee() {
		return custonFee;
	}

	public void setCustonFee(Double custonFee) {
		this.custonFee = custonFee;
	}
	
	public double totalPrice(double custonFee) {
		return this.price += custonFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " +   totalPrice(custonFee) + " (Customs fee: $ " +  custonFee + ")";
	}
	
}
