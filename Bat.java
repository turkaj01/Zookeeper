public class Bat extends Mammal {
    
    
    public void fly() {
        int currentEnergyLevel=getBatEnergy();
        if (currentEnergyLevel>=50) {
            currentEnergyLevel-=50;
            if (currentEnergyLevel<0) currentEnergyLevel=0;
            setBatEnergy(currentEnergyLevel);
            System.out.println("The bat is flying");
            System.out.println("Current energy level: " + currentEnergyLevel);
        } 
        else {
            System.err.println("Bat has no energy to fly");
        }
    }


    public void eatHumans() {
        int currentEnergyLevel=getBatEnergy();
            currentEnergyLevel+=25;
            if(currentEnergyLevel>300) currentEnergyLevel=300;
            setBatEnergy(currentEnergyLevel);
            System.out.println("The bat is happy");
            System.out.println("Current energy level: " + currentEnergyLevel);
    }
    
    public void attackTown() {
        int currentEnergyLevel=getBatEnergy();
        if (currentEnergyLevel>=100) {
        currentEnergyLevel-=100;
        if(currentEnergyLevel<0) currentEnergyLevel=0;
        setBatEnergy(currentEnergyLevel);
        System.out.println("Bat attacked town");
        System.out.println("Current energy level: " + currentEnergyLevel);
    }
    else {
        System.err.println("Bat has no energy to attack");
    }
    }




}
