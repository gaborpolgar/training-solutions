package week07d05;

import javax.xml.crypto.dsig.TransformService;

public class Car extends Vehicle{

    @Override
    public int getNumberOfGears() {
        return  getTransmissionType().getGEAR();
    }

    @Override
    public TransmissionType getTransmissionType() {
        return TransmissionType.AUTOMATIC;
    }
}
