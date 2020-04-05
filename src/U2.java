public class U2 extends Roket {
    public U2() {
        super(120,18000,29000);

    }


    @Override
    public boolean launch() {
        double launchExplosion = 0.004*((double)super.getWeight()/super.getMaxWeight());
        double random = Math.random()*0.1;
        System.out.println(random);
        return launchExplosion<=random;


    }

    @Override
    public boolean land() {
        double landingCrash = 0.008*((double)super.getWeight()/super.getMaxWeight());
        double random = Math.random()*0.1;
        System.out.println(random);
        return landingCrash<=random;
    }
}
