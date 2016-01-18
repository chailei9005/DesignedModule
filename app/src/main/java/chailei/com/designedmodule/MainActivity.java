package chailei.com.designedmodule;


import android.content.Intent;
import android.graphics.Color;
import android.os.StrictMode;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private ActionBar mSupportActionBar;
    private Toolbar mtoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        mSupportActionBar = getSupportActionBar();
////        mSupportActionBar.setLogo(R.mipmap.ic_launcher);
//        mSupportActionBar.setTitle("京东商城");
//        //actionbar 最左边的图片
//        mSupportActionBar.setHomeAsUpIndicator(R.mipmap.ic_launcher);
//        mSupportActionBar.setDisplayHomeAsUpEnabled(true);
        mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        mtoolbar.setTitle("京东");
        mtoolbar.setTitleTextColor(Color.RED);
        mtoolbar.setSubtitle("奶茶");
        mtoolbar.setLogo(R.mipmap.robot);
        setSupportActionBar(mtoolbar);
        mtoolbar.setNavigationIcon(R.mipmap.ic_launcher);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_actionbar, menu);
        MenuItem menuItem =  menu.findItem(R.id.search);
        menuItem.setIntent(new Intent(MainActivity.this,Main2Activity.class));
//        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//
//                startActivity(new Intent(MainActivity.this,Main2Activity.class));
//                return true;
//            }
//        });
        return true;
    }

    //
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.menu_actionbar, menu);
//        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        Log.d("select","home select"+item.getItemId());
//
//
//
//        switch (item.getItemId()){
//            //系统的id 要加android
//            case android.R.id.home:
//                Log.d("finish","home finish");
//                finish();
//                break;
//        }
//        return true;
//    }
//
    public void btnHide(View view) {
//        if(mSupportActionBar!=null) {
//            if (mSupportActionBar.isShowing()) {
//                mSupportActionBar.hide();
//            } else {
//                mSupportActionBar.show();
//            }
//        }
    }
}
