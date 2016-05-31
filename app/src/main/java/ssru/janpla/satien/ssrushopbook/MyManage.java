package ssru.janpla.satien.ssrushopbook;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Pc on 31/5/2559.
 */
public class MyManage {
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public static final String user_table = "userTABLE";
    public static final String column_id = "_id";
    public static final String column_name = "Name";
    public static final String column_Surname = "Surname";
    public static final String column_user = "User";
    public static final String column_password = "Password";
    public static final String column_money = "Money";

    public MyManage(Context context) {
        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();



    }   //Constructor

    public long addNewUser(String StrName,
                           String StrSurname,
                           String StrUser,
                           String StrPassword,
                           String StrMoney)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(column_name, StrName);
        contentValues.put(column_Surname, StrSurname);
        contentValues.put(column_user, StrUser);
        contentValues.put(column_password, StrPassword);
        contentValues.put(column_money,StrMoney);

        return sqLiteDatabase.insert(user_table,null,contentValues);
    }


}   // Main Class
