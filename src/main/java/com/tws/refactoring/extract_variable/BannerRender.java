package com.tws.refactoring.extract_variable;

public class BannerRender {

    String renderBanner(String platform, String browser) {


        boolean isStrContainsMac = platform.toUpperCase().indexOf("MAC") > -1;
        boolean isStrContainsIE = browser.toUpperCase().indexOf("IE") > -1;

        return isStrContainsMac && isStrContainsIE ? "IE on Mac?" : "banner";

    }

}
