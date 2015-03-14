package com.example.ff.nwhack2015;

/**
 * Created by ff on 13/03/15.
 */

import android.os.AsyncTask;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;

import java.util.List;

/**
 * Created by ff on 13/03/15.
 */
public class NetworkingTask extends AsyncTask<String,Void,HttpResponse> {
    private List<NameValuePair> params;

    public NetworkingTask(List<NameValuePair> param_list) {
        super();
        this.params = param_list;
    }

    protected HttpResponse doInBackground(String... urlStr) {
        HttpClient httpClient = new DefaultHttpClient();
        HttpEntity httpEntity;
        if (!urlStr[0].endsWith("?"))
            urlStr[0]+="?";
        String paramString = URLEncodedUtils.format(params, "utf-8");
        HttpGet httpGet = new HttpGet(urlStr[0] + paramString);

        try {
            return httpClient.execute(httpGet);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}