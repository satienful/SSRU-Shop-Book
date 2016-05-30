package ssru.janpla.satien.ssrushopbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    //Explicit
    private EditText nameEditText, surnameEditText,
            userEditText, passwordEditText;
    private String nameString, surnameString,userString, passwordString;
    private static final String urlUpload = "http://swiftcodingthai.com/ssru/add_user_satien.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        surnameEditText = (EditText) findViewById(R.id.editText2);
        userEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);

    }   //Main Method
    public void  clickSignUpSign(View view){
        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space
        if (nameString.equals("")|| surnameString.equals("") ||
                userString.equals("") || passwordString.equals("")) {
            //Have Space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialg(this,"มีช่องว่าง","กรุณากรอกทุกช่อง คะ");
        } else {
            //no Space
            uploadNewUser();
        }

    }   //ClickSing
    private void uploadNewUser() {

    }

}   //Main Class
