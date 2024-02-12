package jd_07_practice_tasks;
/*
 Create a custom class named Address with the following attributes and actions:



      Actions:
            toString(): returns the string representation of the address object in the following format:

                  Example:
                      buildingNumber = 7925;
                      street = "Jones Branch Dr";
                      city = "McLean";
                      state = "VA";
                       zipCode = 22012;

                  Output:
                        7925 Jones Branch Dr
                        McLean Va, 22012

 */
public class Address {
    public int buildingNumber;
    public  String street;
    public String city;
    public  String state;
    public String zipCode;

    @Override
    public String toString() {
        return buildingNumber+" "+street+"\n"+city+" "+state+", "+zipCode;
    }
}
