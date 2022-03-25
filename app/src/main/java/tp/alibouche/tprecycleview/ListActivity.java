package tp.alibouche.tprecycleview;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import tp.alibouche.tprecycleview.adapter.StarAdapter;
import tp.alibouche.tprecycleview.beans.Star;
import tp.alibouche.tprecycleview.service.StarService;

public class ListActivity extends AppCompatActivity {
//    private List<Star> stars;
    private StarAdapter starAdapter = null;
    private RecyclerView recyclerView;
    private StarService service;
    //private StarAdapter starAdapter = null;

//    StarAdapter starAdapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
//        stars = new ArrayList<>();
//        service = StarService.getInstance();
        service = StarService.getInstance();
        init();
        recyclerView = findViewById(R.id.recycle_view);
        //insérer le code

        starAdapter = new StarAdapter(this, service.findAll());
        recyclerView.setAdapter(starAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


    public void init(){
        service.create(new Star("kate bosworth", "https://ilarge.lisimg.com/image/8794654/740full-kate-bosworth.jpg", 3.5f));
        service.create(new Star("george clooney", "https://bonafidepress.com/wp-content/uploads/2020/10/George-Clooney-e1601626190932.jpg", 3));
        service.create(new Star("michelle rodriguez", "https://th.bing.com/th/id/OIP.g8aHTLMjv79PEAs-4mmv-gHaLJ?pid=ImgDet&rs=1", 5));
        service.create(new Star("george clooney", "https://bonafidepress.com/wp-content/uploads/2020/10/George-Clooney-e1601626190932.jpg", 1));
        service.create(new Star("louise bouroin", "https://th.bing.com/th/id/R.48bd33c980c0158dc7ac1609dccc4986?rik=gRFTCXfg9py97A&pid=ImgRaw&r=0", 5));
        service.create(new Star("louise bouroin", "https://th.bing.com/th/id/R.48bd33c980c0158dc7ac1609dccc4986?rik=gRFTCXfg9py97A&pid=ImgRaw&r=0", 1));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView)
                MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            private static final String TAG = "StarAdapter";

            @Override
            public boolean onQueryTextSubmit(String query) {
                return true;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
//                Log.d(TAG, newText);
                if (starAdapter != null){
                    starAdapter.getFilter().filter(newText);
                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.share){
            String txt = "Stars";
            String mimeType = "text/plain";
            ShareCompat.IntentBuilder
                    .from(this)
                    .setType(mimeType)
                    .setChooserTitle("Stars")
                    .setText(txt)
                    .startChooser();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStop() {
        super.onStop();
        service.findAll().clear();
        Star.setComp(0);
    }


}
