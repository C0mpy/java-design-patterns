package com.compi.factory.websites;

import com.compi.factory.pages.AboutPage;
import com.compi.factory.pages.CommentPage;
import com.compi.factory.pages.ContactPage;
import com.compi.factory.pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
