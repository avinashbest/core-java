package com.avinashbest;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address, true);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    /*In future if we change any of these method the main.class is not affected because these are implementation details.*/
    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address, boolean cache) {
        return "127.0.0.1";
    }

}
