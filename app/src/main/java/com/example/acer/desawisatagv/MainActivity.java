package com.example.acer.desawisatagv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCar;
    private StaggeredGridLayoutManager mGridViewLayoutManager;
    private DWAdapter mAdapter;

    private List<DataWisata> carModelList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCar = (RecyclerView) findViewById(R.id.recycler_dw);
        carModelList.add(new DataWisata(R.drawable.img1_dw1_nggligo, "Nggligo","Kelurahan Pagerharjo, Kecamatan Samigaluh, Kulonprogo."));
        carModelList.add(new DataWisata(R.drawable.img2_dw2_domes, "Domes","Desa Sumberharjo, Kecamatan Prambanan, Sleman."));
        carModelList.add(new DataWisata(R.drawable.img3_dw3_tembi, "Tembi","Dusun Tembi, Desa Timbulharjo, Kabupaten Bantul."));
        carModelList.add(new DataWisata(R.drawable.img4_dw4_kebonagung, "Kebon Agung","Kebon Agung, Imogiri, Bantul Yogyakarta."));
        carModelList.add(new DataWisata(R.drawable.img5_dw5_sambi, "Sambi","Jalan Kaliurang km. 19 Padukuhan Sambi, Desa Pakembinangun, Kecamatan Pakem, Kabupaten Sleman."));
        carModelList.add(new DataWisata(R.drawable.img6_dw6_tanjung, "Tanjung","Jalan Palagan Tentara Pelajar Km. 11, tepatnya di Donoharjo, Ngaglik, Sleman."));
        carModelList.add(new DataWisata(R.drawable.img7_dw7_candran, "Candran","Dusun Mandingan, Kelurahan Kebonagung, Kecamatan Imogiri, Kabupaten Bantul."));
        carModelList.add(new DataWisata(R.drawable.img8_dw8_kembangarum, "Kembangarum","Donokerto, Turi, Sleman, di kawasan Lintas Merapi."));
        carModelList.add(new DataWisata(R.drawable.img9_dw9_kasongan, "Kasongan","Pedukuhan Kajen, Desa Bangunjiwo, Kecamatan Kasihan Kabupaten Bantul, Yogyakarta."));
        carModelList.add(new DataWisata(R.drawable.img10_dw10_krebet, "Krebet","Bukit Pajangan Kabupaten Bantul."));

        mAdapter = new DWAdapter(carModelList, this);

        recyclerViewCar.setHasFixedSize(true);
        mGridViewLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        mGridViewLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        recyclerViewCar.setLayoutManager(mGridViewLayoutManager);
        recyclerViewCar.setAdapter(mAdapter);
        SpaceItemGridView decoration = new SpaceItemGridView(10);
        recyclerViewCar.addItemDecoration(decoration);

    }
}
