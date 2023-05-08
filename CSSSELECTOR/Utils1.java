package AppUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils1 {
    public static class ConfigReader {
     //  public static void main (String[] args)
       public static Properties getPropertyObject() throws IOException
        {
            FileInputStream fp = new FileInputStream("C://Users//SONY//javaproject//src//Config//Config.properties");
            Properties prop = new Properties();
            prop.load(fp);
            return prop;
        }

        public static String getUrlMethod() throws IOException

        {
            return getPropertyObject().getProperty("url");
        }

        public static String getMnumber() throws IOException
        {
            return getPropertyObject().getProperty("Mnumber");
        }

        public static String getPassword() throws IOException
        {
            return getPropertyObject().getProperty("Password");
        }
    }
}