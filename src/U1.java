import java.util.Random;

public class U1 extends Roket {


    public U1() {
        super(100,10000,18000);

    }


    @Override
    public boolean launch() {
        double launchExplosion = 0.005*((double)super.getWeight()/super.getMaxWeight());
        double random = Math.random()*0.1;
        System.out.println(random);
        return launchExplosion<=random;


    }

    @Override
    public boolean land() {
        double landingCrash = 0.001*((double)super.getWeight()/super.getMaxWeight());
        double random = Math.random()*0.1;
        System.out.println(random);
        return landingCrash<=random;
    }

}
