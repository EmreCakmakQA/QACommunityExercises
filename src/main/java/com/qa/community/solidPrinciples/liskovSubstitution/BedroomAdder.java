package com.qa.community.solidPrinciples.liskovSubstitution;

public class BedroomAdder {
    public void addBedroom(Penthouse penthouse) {
        penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 5);
    }
}
