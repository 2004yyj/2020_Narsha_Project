package com.example.guji

import android.content.Intent
import android.graphics.drawable.Drawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.guji.retroFit.Model
import com.naver.maps.geometry.LatLng
import com.naver.maps.geometry.WebMercatorCoord
import com.naver.maps.map.*
import com.naver.maps.map.overlay.Marker
import kotlinx.android.synthetic.main.activity_place.*
import kotlin.properties.Delegates

class PlaceActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mapView : MapView
    private var latitude : Double = 0.0
    private var longtitude : Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place)

        val model : Model? = intent.getParcelableExtra("list")
        position_text.text = model?.name
        place.text = model?.name
        sub_category.text = model?.sub_category
        address.text = model?.address

        latitude = model?.latitude!!
        longtitude = model.longitude

        val name = model.name

        setSupportActionBar(place_toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        place_toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)

        openNaverMap.setOnClickListener {
            try {
                val url = "nmap://place?lat=$latitude&lng=$longtitude&name=$name&appname=com.example.guji"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            catch (e : Exception) {
                val url = "market://details?id=com.nhn.android.nmap"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }

        place_toolbar.setNavigationOnClickListener {
            finish()
        }

        var mapFragment: MapFragment? = supportFragmentManager.findFragmentById(R.id.navermap_fragment) as MapFragment?
        if(mapFragment == null) {
            mapFragment = MapFragment.newInstance()
            supportFragmentManager.beginTransaction().add(R.id.navermap_fragment, mapFragment).commit()
        }
        mapFragment?.getMapAsync(this)
    }

    override fun onMapReady(naverMap: NaverMap) {
        val location = LatLng(latitude, longtitude)
        val marker = Marker()
        val cameraPosition = CameraPosition(location, 19.0)
        naverMap.cameraPosition = cameraPosition
        marker.position = location
        marker.map = naverMap
    }
}