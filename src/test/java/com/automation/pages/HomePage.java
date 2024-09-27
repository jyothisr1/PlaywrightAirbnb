package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.microsoft.playwright.Locator;

public class HomePage extends BasePage{

    Locator where;
    Locator region;
    Locator clickCheckInDate;
    Locator selectCheckInDate;
    Locator checkOutDate;
    Locator noOfPersons;
    Locator searchButton;
    Locator addAdults;

    public HomePage(){
        where= page.getByPlaceholder("Search destinations");
        region=page.locator("//span[text()='Europe']/preceding-sibling::img");
        clickCheckInDate=page.locator("//div[text()='Check in']");
        selectCheckInDate=page.locator("//h2[text()='September 2024']/ancestor::div/table//tr/td[contains(@aria-label,'18')]");
        checkOutDate=page.locator("//h2[text()='September 2024']/ancestor::div/table//tr/td[contains(@aria-label,'19')]");
        noOfPersons=page.locator("//div[text()='Add guests']/parent::div");
        addAdults=page.locator("//h1[@id='searchFlow-title-label-adults']/ancestor::section/following-sibling::div/button[2]");
        searchButton=page.getByTestId("structured-search-input-search-button");
    }
    public void openWebsite() {
        page.navigate(ConfigReader.getConfigValue("application.url"));
    }

    public void clickOnWhere() {
        where.click();
    }

    public void selectRegion(String configValue) {
        region.click();
    }

    public void selectCheckInDate() {
        clickCheckInDate.click();
        selectCheckInDate.click();
    }

    public void selectCheckOutDate() {
        checkOutDate.click();
    }

    public void selectNumberOfPeople() {
        noOfPersons.click();
        addAdults.click();
    }

    public void clickOnSearch() {
        searchButton.click();
    }

    public Locator getHomePageContent() {
        return where;
    }
}
