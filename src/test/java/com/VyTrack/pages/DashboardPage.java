package com.VyTrack.pages;

import com.VyTrack.pages.PageBase;
import com.VyTrack.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends PageBase {
    //no need to explicitly write constructors, because it will use its parents constructor.
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}