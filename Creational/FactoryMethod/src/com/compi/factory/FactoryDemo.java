package com.compi.factory;

import com.compi.factory.websites.Website;
import com.compi.factory.websites.WebsiteFactory;
import com.compi.factory.websites.WebsiteType;

public class FactoryDemo {

    public static void main(String[] args) {

        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(website.getPages());
    }
}
