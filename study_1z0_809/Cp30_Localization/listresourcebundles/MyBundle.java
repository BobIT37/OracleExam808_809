package com.wealth.certificate.study_1z0_809.chapter30.listresourcebundles;

import java.util.ListResourceBundle;

public class MyBundle extends ListResourceBundle {
	@Override
    protected Object[][] getContents() {
        return new Object[][] {
            { "hi", "Hola" }
        };
    }
}

