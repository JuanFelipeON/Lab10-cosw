package co.edu.pdam.eci.persistenceapiintegration.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.room.Room;
import co.edu.pdam.eci.persistenceapiintegration.R;

import co.edu.pdam.eci.persistenceapiintegration.data.AppDatabase;

public class MainActivity
    extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-team").build();

        db.teamDao().getAll();


    }
}
