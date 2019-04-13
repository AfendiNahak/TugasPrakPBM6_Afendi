package afendi490.gmail.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class List extends AppCompatActivity {

    //Todo 1 : deklarasi objek listview
    ListView list;

    //Todo 2 : deklarasi array bertipe String untuk menampung data nama
    String[] maintitle ={
            "shikamaru","lee",
            "nejji","kiba",
            "Shino","Chouji",
    };

    //Todo 3 : deklarasi array bertipe String untuk menampung data email
    String[] subtitle ={
            "shikamaru@gmail.com","lee@gmail.com",
            "nejji@gmail.com","kiba@gmail.com",
            "Shino@gmail.com", "Chouji@gmail.com",
    };

    //Todo 4 : deklarasi array bertipe integer untuk menampung data gambar
    Integer[] imgid={
            R.drawable.gambar_1,R.drawable.gambar_2,
            R.drawable.gambar_3,R.drawable.gambar_4,
            R.drawable.gambar_5,R.drawable.gambar_6
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // TODO 5 : membuat list adapter untuk listview
        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {

                //Todo 6 : struktur if-else untuk menampilkan nama email jika di klik
                if(position == 0) {
                    Toast.makeText(getApplicationContext(),"shikamaru@gmail.com",Toast.LENGTH_SHORT).show();
                }
                else if(position == 1) {
                    Toast.makeText(getApplicationContext(),"lee@gmail.com",Toast.LENGTH_SHORT).show();
                }
                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"nejji@gmail.com",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"kiba@gmail.com",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"Shino@gmail.com",Toast.LENGTH_SHORT).show();
                }
                else if(position == 5) {
                    Toast.makeText(getApplicationContext(),"Chouji@gmail.com",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
