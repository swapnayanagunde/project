package amazon.tests;

import AppUtils.Utils;
import amazon.library.homepage;
import amazon.library.loginpage;
import org.testng.annotations.Test;

public class userlogin extends Utils {
    @Test
    public void verifyloginmodule() throws InterruptedException {
        loginpage lhome = new loginpage();
        lhome.verifylogin("9550154060","Amazon@2023");
        homepage hlhome = new homepage();
        hlhome.logout();
    }
}
