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
		return custonFee + this.custonFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " +  String.format("%2.f ", price) + " (Customs fee: $ " + String.format("%2.f", custonFee) + ")";
	}
	
}
