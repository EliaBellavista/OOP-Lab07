package it.unibo.oop.lab.enum1;

import java.util.List;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        SportSocialNetworkUserImpl<User> mrossi = new SportSocialNetworkUserImpl<User>("mario", "Rossi", "mrosi", 110);
        mrossi.addSport(Sport.SOCCER);
        mrossi.addSport(Sport.BASKET);
        mrossi.addSport(Sport.BASKET);
        
        System.out.println(mrossi.hasSport(Sport.BASKET) + "" + mrossi.hasSport(Sport.SOCCER) + mrossi.hasSport(Sport.BIKE));
        
        List<Sport> s = mrossi.getSports();  
        for(Sport i : s) {
        	System.out.println(i);
        }
    }
}
