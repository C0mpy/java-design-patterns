package com.compi.factory.websites;

import com.compi.factory.pages.CartPage;
import com.compi.factory.pages.ItemPage;
import com.compi.factory.pages.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
