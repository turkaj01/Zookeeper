public class Mammal {
    private int energy=100;
    private int batEnergy=300;

    public int getBatEnergy() {
        return batEnergy;
    }

    public void setBatEnergy(int energy){
        this.batEnergy=energy;
    }

    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy=energy;
    }

    public int displayEnergy() {
       int currentEnergyLevel=getEnergy();
       return currentEnergyLevel;
    }


}
