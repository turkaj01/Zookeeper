public class Test{
    public static void main(String[] args) {
        Gorilla g1 = new Gorilla();
        Bat bat= new Bat();

        g1.throwSomething();
        g1.throwSomething();
        g1.throwSomething();
        g1.eatBananas();
        g1.eatBananas();
        g1.climb();
        System.err.println("");
        System.err.println("");
        
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();




    }
}