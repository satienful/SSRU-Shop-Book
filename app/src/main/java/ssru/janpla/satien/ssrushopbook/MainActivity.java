package ssru.janpla.satien.ssrushopbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Explicit
    private MyManage myManage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Request Sqlite
        myManage = new MyManage(MainActivity.this);

        //Test Add Value To SQLite
        myManage.addNewUser("name", "sur", "user", "pass","money");

    }   // Main Method

    public void clickSignUpMain(View view){
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }

}   //Main Class

