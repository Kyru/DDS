package com.visual.conserapp;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static java.sql.DriverManager.println;

public class Principal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

     //   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    /*    fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        // Comentario Ferran para probar GIT
        //Probando GIT hector

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    public boolean onNavSuperior(MenuItem menuitem, View view){

        boolean checked = ((RadioButton) view).isChecked();

        RadioGroup radiogrupo = (RadioGroup) findViewById(R.id.rg);
        int idRadioGrupo = radiogrupo.getCheckedRadioButtonId();

        Bundle bundle = new Bundle();
        String res = "";

        if(checked) {
            switch (idRadioGrupo) {
                case R.id.radioButton1:
                    res = "button1";
                    break;
                case R.id.radioButton2:
                    res = "button2";
                    break;
                case R.id.radioButton3:
                    res = "button3";

                    break;

            }
        }
        bundle.putString("switch", res);



        int id = menuitem.getItemId();
        Intent intent;
        if(id == R.id.cart_id)  intent = new Intent(this,Cart.class);
        else intent = new Intent(this,Offers.class);

        intent.putExtras(bundle);
        startActivity(intent);

        return true;
    }

    public void selectOptionTest(){

    }

    public void onRadioButtonClicked(MenuItem menuitem, View view) {
/*
        String res = "Default";

        RadioGroup radiogrupo = (RadioGroup) findViewById(R.id.rg);
        int idRG = radiogrupo.getCheckedRadioButtonId();


        int id = menuitem.getItemId();
        /*Intent intent;
        if(id == R.id.cart_id)  intent = new Intent(this,Cart.class);
        else intent = new Intent(this,Offers.class);*/
/*
        Bundle bundle = new Bundle();

        switch(idRG) {
            case R.id.radioButton1:
                if (checked)
                        res = "button1";
                        bundle.putString("switch", res);
                    break;
            case R.id.radioButton2:
                if (checked)
                        res = "button2";
                        bundle.putString("switch", res);
                    break;
            case R.id.radioButton3:
                if (checked)
                        res = "button3";
                        bundle.putString("switch", res);
                    break;
        }

        intent.putExtras(bundle);

        startActivityForResult(intent, 0000);
*/




    }


































}
