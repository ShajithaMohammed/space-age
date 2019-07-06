import java.util.HashMap;
import java.util.Map;

class SpaceAge {

    private double seconds;
    Map<String,Double> orbitalPeriod=new HashMap<String,Double>();

    SpaceAge(double seconds) {
        this.seconds=seconds;
        orbitalPeriod.put("earth",31557600.0);
        orbitalPeriod.put("mercury",0.2408467);
        orbitalPeriod.put("venus",0.61519726);
        orbitalPeriod.put("mars",1.8808158);
        orbitalPeriod.put("jupiter",11.862615);
        orbitalPeriod.put("saturn",29.447498);
        orbitalPeriod.put("uranus",84.016846);
        orbitalPeriod.put("neptune",164.79132);
    }

    double onEarth() {
        return seconds/orbitalPeriod.get("earth");
    }

    double onMercury() {
        seconds=seconds/orbitalPeriod.get("mercury");
        return onEarth();
    }

    double onVenus() {
        seconds=seconds/orbitalPeriod.get("venus");
        return onEarth();
    }

    double onMars() {
        seconds=seconds/orbitalPeriod.get("mars");
        return onEarth();
    }

    double onJupiter() {
        seconds=seconds/orbitalPeriod.get("jupiter");
        return onEarth();
    }

    double onSaturn() {
        seconds=seconds/orbitalPeriod.get("saturn");
        return onEarth();
    }

    double onUranus() {
        seconds=seconds/orbitalPeriod.get("uranus");
        return onEarth();
    }

    double onNeptune() {
        seconds=seconds/orbitalPeriod.get("neptune");
        return onEarth();
    }

}
