package com.example.pc.mhealth;


import android.app.ActionBar;
import android.content.res.Configuration;



import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pc.mhealth.fragments.ActividadesFragment;
import com.example.pc.mhealth.fragments.ContactoFragment;
import com.example.pc.mhealth.fragments.InformacionFragment;
import com.example.pc.mhealth.fragments.MapaFragment;
import com.example.pc.mhealth.fragments.NoticiasFragment;
import com.example.pc.mhealth.fragments.SponsorsFragment;
import com.google.android.gms.maps.SupportMapFragment;


public class MainActivity extends ActionBarActivity implements DrawerLayout.DrawerListener {

    private ListView navList;
    public String[] opciones;
    DrawerLayout drawer;

    private ActionBarDrawerToggle toggle;

    //para el pager
    ViewPager pager;
    ActionBar actionBar;

    //Links de Incripsiones
    TextView insc_entrenamiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //region Drawer

        this.navList = (ListView) findViewById(R.id.left_drawer);//Obtenemos el ListView desde el xml que fuciona como el menu drawer

        //Obtenemos el Array de los recursos
        opciones = getResources().getStringArray(R.array.list_drawer);

        //Enviamos los valores al listView del xml que funciona como drawer
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones);
        navList.setAdapter(adapter);
        //****************Hasta aqui muestra las opciones sin ningun evento***********************//


        //Se envia el Evento setOnItemClickListener al ListView.
        navList.setOnItemClickListener(new DrawerItemClickListener());
        //Obtengo el drawer para poder cerrarlo cuando le doy click a una opcion
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        //Para mostrar el boton de la flecha y tres lineas
        drawer.setDrawerListener(this); //COn esta linea se crean los eventos onDrawerSlider, onDrawerOpened, onDrawerClosed, onDrawerStateChanged
        //toggle = new ActionBarDrawerToggle(this, drawer, R.string.drawer_open, R.string.drawer_close);
        toggle = new ActionBarDrawerToggle(this,drawer,R.string.drawer_open,R.string.drawer_close);
        //Con esto me muestra el boton pero no hace el efecto
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //endregion

       insc_entrenamiento = (TextView) findViewById(R.id.link_entrenamiento);
    }



    //region Eventos para boton toggle
    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    //Con estos ultimos cuatro eventos se hace el efecto

    @Override
    public void onDrawerSlide(View view, float v) {
    toggle.onDrawerSlide(view,v);
    }

    @Override
    public void onDrawerOpened(View view) {
    toggle.onDrawerOpened(view);
    }

    @Override
    public void onDrawerClosed(View view) {
    toggle.onDrawerClosed(view);
    }

    @Override
    public void onDrawerStateChanged(int i) {
    toggle.onDrawerStateChanged(i);
    }
    //endregion


    //region Eventos drawer
    private class DrawerItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            switch (i){
                case 0:
                    ActividadesFragment actividades = new ActividadesFragment();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.content_frame,actividades);
                    transaction.commit();
                    break;
                case 1:
                    InformacionFragment informacion = new InformacionFragment();
                    FragmentTransaction transacion1 = getSupportFragmentManager().beginTransaction();
                    transacion1.replace(R.id.content_frame,informacion);
                    transacion1.commit();
                    break;
                case 2:
                     SponsorsFragment sponsors = new SponsorsFragment();
                    FragmentTransaction transacion2 = getSupportFragmentManager().beginTransaction();
                    transacion2.replace(R.id.content_frame,sponsors);
                    transacion2.commit();
                    break;
                case 3:
                    NoticiasFragment noticias = new NoticiasFragment();
                    FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                    transaction3.replace(R.id.content_frame,noticias);
                    transaction3.commit();
                    break;
                case 4:
                    MapaFragment mapa = new MapaFragment();
                    FragmentTransaction transaction4 = getSupportFragmentManager().beginTransaction();
                    transaction4.replace(R.id.content_frame,mapa);
                    transaction4.commit();
                    break;
                case 5:
                    ContactoFragment contacto = new ContactoFragment();
                    FragmentTransaction transaction5 = getSupportFragmentManager().beginTransaction();
                    transaction5.replace(R.id.content_frame,contacto);
                    transaction5.commit();
                    break;

            }
            drawer.closeDrawers();
        }
    }
    //endregion



}