package org.example.chapter07.orderApp;



public class Order {
    private  Product product;
    private int quantity;

    Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    double calculateTotalPrice() {
        double tax = product.calculateTax();
        double totalPrice = (product.getPrice() + tax ) * quantity;
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order Detail[ " + product.getName() + " * " + "Quantity: " + quantity + " >> " + calculateTotalPrice() + " ]";

        //cf) toString();
        // '클래스명@해당객체의주소값'이 문자열로 출력
        // - 객체를 문자열로 표현할 때 사용 (재정의하여 사용자 편의 문자 출력 가능)
        // - 모든 클래스의 최사우이 클래스인 Object 클래스에 정의
    }
}
