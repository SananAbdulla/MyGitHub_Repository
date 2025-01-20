package day38_a_abstraction_interface.relation;

// going from interface to interface we use extends not implements!
// interface can extend multiple interfaces

import day38_a_abstraction_interface.shopping.Shipping;

public interface ConsumerApp extends AllowUserToSell{




}
// going from interface to class, we use implements
abstract class Test implements AllowUserToSell, Shipping {

}
class Runner{

    public static void main(String[] args) {

    }
}
