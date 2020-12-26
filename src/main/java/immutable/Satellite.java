package immutable;

public class Satellite {

    private CelestialCoordinates destinationCoordinates;
    private String registerIdent;


    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent) {
        this.destinationCoordinates = destinationCoordinates;
        if (isEmpty(registerIdent)){
            throw new IllegalArgumentException("Must be contains character/s");
        }
        this.registerIdent = registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff){
        destinationCoordinates = new CelestialCoordinates(destinationCoordinates.getX() + diff.getX(), destinationCoordinates.getY()+ diff.getY(), destinationCoordinates.getZ() + diff.getZ() );
    }

    public CelestialCoordinates getDestinationCoordinates() {
        return destinationCoordinates;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    public boolean isEmpty(String str){
        return str == null || str.trim().equals("");
    }


    public String toString(){
        return registerIdent + " : " + destinationCoordinates.toString();
    }


}
