package com.deadinside.business;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Request
{
    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    public String sendRequest(String hostPath,String servicePath,String apiKey,String location) throws IOException {
        HttpGet httpGet = new HttpGet(hostPath+servicePath+"?key="+apiKey+"&location="+ URLEncoder.encode(location,"UTF-8")+"&maxResults=1");
        CloseableHttpResponse  response = httpClient.execute(httpGet);
        return EntityUtils.toString(response.getEntity());

    }
}
