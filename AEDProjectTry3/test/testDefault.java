//import Business.DB4OUtil.DB4OUtil;
//import Business.EcoSystem;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class testDefault {
//    private EcoSystem ecoSystem;
//    private DB4OUtil dB4OUtil;
//
//    @Before
//    public void setup() {
//        dB4OUtil = DB4OUtil.getInstance(); 
//        ecoSystem = dB4OUtil.retrieveSystem();
//    }
//
//    @Test
//    public void testCustomerLogin() {
//        // testing code
//        assertNotNull( ecoSystem.loginCustomer("kd@neu.edu","12345"));
//        assertNull( ecoSystem.loginCustomer("nousr","nopass"));
//    }
//
//    @Test
//    public void testRestaurantLogin() {
//        // testing code
//        assertNotNull( ecoSystem.loginResaturant("w@neu.com","12345"));
//        assertNull( ecoSystem.loginResaturant("nousr","nopass"));
//        assertNotNull(ecoSystem.findRestaurant( "w@neu.com"));
//    }
//
//    @Test
//    public void testFindRestaurant() {
//        // testing code
//        assertNull( ecoSystem.findRestaurant("IamNotArestaurent"));
//        assertNotNull(ecoSystem.findRestaurant( "w@neu.com"));
//    }
//}
