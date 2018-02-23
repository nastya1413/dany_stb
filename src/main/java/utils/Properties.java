package utils;

import org.openqa.selenium.remote.BrowserType;

public class Properties {
    private static final String DEFAULT_BASE_ADMIN_URL = "http://hollywood.slingbox.com/demos/Austin%20Slingplayer.htm";
    private static final String DEFAULT_BROWSER = BrowserType.CHROME;

    public static String getBaseAdminURL(){
        return System.getProperty(EnvironmentVariables.BASE_ADMIN_URL.toString(), DEFAULT_BASE_ADMIN_URL);
    }

    public static String getBrowser() {
        return System.getProperty(EnvironmentVariables.BROWSER.toString(), DEFAULT_BROWSER);
    }

    public static enum EnvironmentVariables {
        BASE_ADMIN_URL("env.admin.url"),
        BROWSER("browser");

     private String value;
     EnvironmentVariables(String value) { this.value = value; }

        @Override
        public String toString() {
            return value;
        }
    }
}
