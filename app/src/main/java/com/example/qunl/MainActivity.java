package com.example.qunl;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    // Khai báo 2 vùng giao diện độc lập
    View screenAnh1;
    View screenAnh2;
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screenAnh1 = findViewById(R.id.screen_anh_1);
        screenAnh2 = findViewById(R.id.screen_anh_2);

        bottomNavigation.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.nav_home) {
                screenAnh1.setVisibility(View.VISIBLE);
                screenAnh2.setVisibility(View.GONE);
                return true;

            } else if (itemId == R.id.nav_tasks) {
                screenAnh1.setVisibility(View.GONE);
                screenAnh2.setVisibility(View.VISIBLE);
                return true;
            }
            return false;
        });
    }
}
