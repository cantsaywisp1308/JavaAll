package Demo;

import Model.ProductModel;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductModel productModel = new ProductModel();
		System.out.println("total quantity: "+productModel.sum1());
		System.out.println("total money: "+productModel.sum2());
		System.out.println("total product - true: "+productModel.count(true));
	}

}
