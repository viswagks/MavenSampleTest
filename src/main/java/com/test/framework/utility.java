package com.test.framework;

import org.openqa.selenium.WebElement;

public class utility
{
	public void clickObject(WebElement objElement)
	{
		if(objElement.isDisplayed())
		{
			objElement.click();
		}
	}
}
