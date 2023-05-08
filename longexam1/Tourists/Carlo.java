package Tourists;


import Locations.*;

public class Carlo implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("ang budget ko ay " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("aye gala boracay" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("shish wala na budget umay");
        }

      checkBudget();
        
    }

    public void visit(Bohol bohol) {

        if(budget >bohol.airFare){
            System.out.println("Yownn makakagala pa sa bohol");
            budget -= bohol.airFare;
        }else{
            System.out.println("umay naman ubos na pera");
        }

        checkBudget();
    }
    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("YAAAAANNNN CEBU NAMAN NEXT");
            budget -= cebu.airFare;
        }else{
            System.out.println("umay naman ubos na pera");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Tara palawan naman next");
            budget -= palawan.airFare;
        }else{
            System.out.println("umay naman ubos na pera");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("SIARGAOO NAMAN!!!!");
            budget -= siargao.airFare;
        }else{
            System.out.println("umay naman ubos na pera");
        }

        checkBudget();
    }

    public void visit(Vigan vigan) {
        if(budget >vigan.airFare){
            System.out.println("VIGAN NAMAN ");
            budget -= vigan.airFare;
        }else{
            System.out.println("umay naman ubos na pera");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}
