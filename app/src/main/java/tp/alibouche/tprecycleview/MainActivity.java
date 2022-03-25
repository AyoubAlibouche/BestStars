//package tp.alibouche.tprecycleview;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.GridLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.Toast;
//
//import tp.alibouche.tprecycleview.adapter.StarAdapter;
//import tp.alibouche.tprecycleview.beans.Star;
//import tp.alibouche.tprecycleview.service.StarService;
//
//
//public class MainActivity extends AppCompatActivity  {
//
//    private StarService fs;
//    private RecyclerView recycle;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        fs = StarService.getInstance();
//
//        fs.create(new Star("Cabbage", 12, "https://www.hindimeaning.com/wp-content/uploads/2012/12/green-cabbage.jpg"));
//        fs.create(new Star("Cauliflower", 12, "https://www.hindimeaning.com/wp-content/uploads/2015/08/cauliflower.jpg"));
//        fs.create(new Star("Carrot", 12, "https://www.hindimeaning.com/wp-content/uploads/2012/12/carrots-vegetables.jpg"));
//        fs.create(new Star("Cabbage", 12, "https://www.hindimeaning.com/wp-content/uploads/2012/12/green-cabbage.jpg"));
//        fs.create(new Star("Cauliflower", 12, "https://www.hindimeaning.com/wp-content/uploads/2015/08/cauliflower.jpg"));
//        fs.create(new Star("Carrot", 12, "https://www.hindimeaning.com/wp-content/uploads/2012/12/carrots-vegetables.jpg"));
//        fs.create(new Star("Cabbage", 12, "https://www.hindimeaning.com/wp-content/uploads/2012/12/green-cabbage.jpg"));
//        fs.create(new Star("Cauliflower", 12, "https://www.hindimeaning.com/wp-content/uploads/2015/08/cauliflower.jpg"));
//        fs.create(new Star("Carrot", 12, "https://www.hindimeaning.com/wp-content/uploads/2012/12/carrots-vegetables.jpg"));
//        fs.create(new Star("Cabbage", 12, "https://www.hindimeaning.com/wp-content/uploads/2012/12/green-cabbage.jpg"));
//        fs.create(new Star("Cauliflower", 12, "https://www.hindimeaning.com/wp-content/uploads/2015/08/cauliflower.jpg"));
//        fs.create(new Star("Carrot", 12, "https://www.hindimeaning.com/wp-content/uploads/2012/12/carrots-vegetables.jpg"));
//
//        recycle = findViewById(R.id.recycle);
//        recycle.setAdapter(new StarAdapter(getApplicationContext(), fs.findAll()));
//        recycle.setLayoutManager(new GridLayoutManager(this, 2));
//
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }
//
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        switch(id) {
//            case R.id.save :
//                Toast.makeText(this, "save", Toast.LENGTH_LONG).show();
//
//                return true;
//            case R.id.edit :
//                Toast.makeText(this, "locate", Toast.LENGTH_LONG).show();
//                return true;
//            case R.id.exit :
//                Toast.makeText(this, "exit", Toast.LENGTH_LONG).show();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//}
//
//
//
