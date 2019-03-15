package com.scriptwriterapp.music;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Value extends AsyncTask<Integer,Void,Integer> {
    protected void onPreExecute(){
        super.onPreExecute();
    }
    private String pc;
    private String site;
public void getValue(String p,String s)
{
     pc = p;
     site = s;
}
protected Integer doInBackground(Integer ...code){
        try {
            URL u = new URL (" http://www.scriptwriter.ml/music/?pc="+pc+"&site="+site+"&id=bemusic");
            HttpURLConnection huc =  (HttpURLConnection) u.openConnection();
            huc.connect();
            code[0] = huc.getResponseCode();
            huc.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return code[0];
    }
    protected void onPostExecute(Integer result){

        super.onPostExecute(result);
        }
}
