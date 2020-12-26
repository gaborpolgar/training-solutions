package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> tracedSatellites = new ArrayList<>();

    public void registerSatellite(Satellite satellite) {
        if (satellite == null) {
            throw new IllegalArgumentException("satellite don't be null!");
        }
        tracedSatellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        for (Satellite satellite : tracedSatellites) {
            if (registerIdent.equals(satellite.getRegisterIdent())) {
                return satellite;
            }
        }
            throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
    }

    @Override
    public String toString() {
        return tracedSatellites.toString();
    }
}

