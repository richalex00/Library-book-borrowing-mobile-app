package ie.ul.libraryfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap){
        map = googleMap;

        //Coordinates of each limerick library

        LatLng Library = new LatLng(52.66464322318115, -8.62358103040355);
        map.addMarker(new MarkerOptions().position(Library).title("Town Library"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Library));

        LatLng Library2 = new LatLng(52.64023123008026, -8.645974376992454);
        map.addMarker(new MarkerOptions().position(Library2).title("Crescent Library"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Library2));

        LatLng Library3 = new LatLng(52.67914606380848, -8.638154447647418);
        map.addMarker(new MarkerOptions().position(Library3).title("Moyross Library"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Library3));

        LatLng Library4 = new LatLng(52.67342558466606, -8.573452086268263);
        map.addMarker(new MarkerOptions().position(Library4).title("Glucksman"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Library4));
    }
}