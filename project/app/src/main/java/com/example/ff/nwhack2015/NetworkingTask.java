package com.example.ff.nwhack2015;

/**
 * Created by ff on 13/03/15.
 */

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.InputStream;
import java.security.KeyStore;
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
        System.out.println(urlStr[0] + paramString);
        HttpGet httpGet = new HttpGet(urlStr[0] + paramString);
        try {
            return httpClient.execute(httpGet);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /*protected void onPostExecute(HttpResponse result) {
        try {
            InputStream is = result.getEntity().getContent();
            int data = is.read();
            while (data !=-1) {
                System.out.print((char) data);
                data = is.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}