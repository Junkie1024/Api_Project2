package com.example.api_project;

import android.os.AsyncTask;

public class Asyncdata extends AsyncTask<String,Void,String> {


    @Override
    protected void onPreExecute() {

        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {

        super.onPostExecute(s);
    }

    @Override
    protected String doInBackground(String... strings) {

        String jsonurl = strings[0];

        Http_handler sh = new Http_handler();

        String json = sh.makeServiceCall(jsonurl);
        System.out.println("This is JSON: "+json);

        return json;
    }
}
