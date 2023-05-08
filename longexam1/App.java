import Locations.*;
import Tourists.*;



public class App {
    public static void main(String[] args) throws Exception {

        Locations Bohol = new Bohol();
        Locations Boracay = new Boracay();
        Locations Cebu = new Cebu();
        Locations Palawan = new Palawan();
        Locations Siargao = new Siargao();
        Locations Vigan = new Vigan();

        Tourist Carlo = new Carlo();

        Boracay.accept(Carlo);
        Bohol.accept(Carlo);
        Cebu.accept(Carlo);
        Palawan.accept(Carlo);
        Siargao.accept(Carlo);
        Vigan.accept(Carlo);



    }
}