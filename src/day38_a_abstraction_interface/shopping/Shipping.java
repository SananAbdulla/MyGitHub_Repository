package day38_a_abstraction_interface.shopping;

public interface Shipping {
// everything is public
// variables are by default public static and final
// CONSTANT variable --> public static final

    String COUNTRY = "USA";

 void shippingCost(boolean hasMembership);
}
