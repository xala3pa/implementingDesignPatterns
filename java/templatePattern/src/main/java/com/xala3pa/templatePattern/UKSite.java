package com.xala3pa.templatePattern;

public class UKSite extends Site {
    protected void uploadSiteInstance() {
        System.out.println("Loading UK site...");
    }

    protected void populateSiteData() {
        System.out.println("Saving UK site data...");
    }

    protected void registerDomain() {
        System.out.println(".co.uk domain registered...");

    }
}
