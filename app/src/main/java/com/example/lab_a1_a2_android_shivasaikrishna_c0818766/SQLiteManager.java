package com.example.lab_a1_a2_android_shivasaikrishna_c0818766;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class SQLiteManager extends SQLiteOpenHelper {
    private static  SQLiteManager sqLiteManager;

    private static final String DATABASE_NAME = "productsDb";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "products";
    private static final String COUNTER = "Counter";

    private static final String ID_FIELD = "ID";
    private static final String NAME_FILED = "name";
    private static final String DESCRIPTION_FIELD = "description";
    private static final String PRICE_FIELD = "price";
    private static final String PROV_NAME_FIELD = "provider";
    private static final String EMAIL_FIELD = "email";



    public SQLiteManager( Context context,) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public static SQLiteManager instanceOfDatabase(Context context){
        if(sqLiteManager == null)
            sqLiteManager = new SQLiteManager(context);
        return  sqLiteManager;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        StringBuilder sql;
        sql = new StringBuilder()
                .append("CREATE TABLE")
                .append(TABLE_NAME)
                .append("(")
                .append(COUNTER)
                .append("INTEGER PRIMARY KEY AUTOINCREMENT")
                .append(ID_FIELD)
                .append("INT,")
                .append(NAME_FILED)
                .append("TEXT, ")
                .append(DESCRIPTION_FIELD)
                .append("TEXT, ")
                .append(PRICE_FIELD)
                .append("DOUBLE,")
                .append(PROV_NAME_FIELD)
                .append("TEXT, ")
                .append(EMAIL_FIELD)
                .append("TEXT, ");




    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
switch (oldVersion){
    case 1;
    sqLiteDatabase.execSQL("ALTER TABLE " + TABLE_NAME + " ADD COLUMN " + NEW COLUMN + " TEXT");
}
    }
}
