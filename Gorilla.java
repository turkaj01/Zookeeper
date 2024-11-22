public class Gorilla extends Mammal {


    public void throwSomething() {
        int currentEnergyLevel=getEnergy();
            currentEnergyLevel-=5;
            if(currentEnergyLevel<0) currentEnergyLevel=0;
            setEnergy(currentEnergyLevel);
            System.out.println("Gorilla just threw something");
            System.out.println("Energy level: " + currentEnergyLevel);
            
    }
    public void eatBananas() {
        int currentEnergyLevel=getEnergy();
        currentEnergyLevel+=10;
        if(currentEnergyLevel>100) currentEnergyLevel=100;
        setEnergy(currentEnergyLevel);
        System.out.println("Gorilla is very happy");
        System.out.println("Energy level: " + currentEnergyLevel);

        
    }

    public void climb() {
        int currentEnergyLevel=getEnergy();
            currentEnergyLevel-=10;
            if (currentEnergyLevel<0) currentEnergyLevel=0;
            setEnergy(currentEnergyLevel);
            System.out.println("Gorilla has climbed a tree");
            System.err.println("Energy level: " + currentEnergyLevel);
            
    }



}
