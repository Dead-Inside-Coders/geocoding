
package com.deadinside;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Config.initProperties();
        System.out.println(Config.getApiKey());
        System.out.println(Config.getHostPath());
        System.out.println(Config.getServicePath());
    }
}
 