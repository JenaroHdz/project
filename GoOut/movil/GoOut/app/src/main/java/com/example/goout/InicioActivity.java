package com.example.goout;

import android.app.Activity;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.goout.adaptadores.AdaptadorDatosCasa;
import com.example.goout.clases.Casa;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class InicioActivity extends Activity implements Response.Listener<String>,Response.ErrorListener {

    ArrayList<Casa> lstDatosCasa;
    RecyclerView rcwDatosCasa;

    RequestQueue request;
    StringRequest jsonObjectRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        request = Volley.newRequestQueue(getBaseContext());
        lstDatosCasa = new ArrayList<>();
        rcwDatosCasa = (RecyclerView)findViewById(R.id.RcwDatosCasa);
        rcwDatosCasa.setLayoutManager(new GridLayoutManager(this,2));
        cargarWebService();
    }

    private void cargarWebService() {
        String url = "http://192.168.1.72:8000/api/v1/nombres";
        jsonObjectRequest = new StringRequest(Request.Method.GET,url,this,this);
        request.add(jsonObjectRequest);
    }

    @Override
    public void onResponse(String response) {
        try {
            JSONArray a = new JSONArray(response);
            for (int i=0;i<a.length();i++){
                JSONObject jo = (JSONObject) a.get(i);
                lstDatosCasa.add(new Casa(" "+jo.getString("name"),R.drawable.ic_launcher_background,""));
            }
            AdaptadorDatosCasa adpDatosCasa = new AdaptadorDatosCasa(lstDatosCasa);
            rcwDatosCasa.setAdapter(adpDatosCasa);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(getBaseContext(),"No se pudo consultar "+error.toString(),Toast.LENGTH_SHORT).show();
    }



}
