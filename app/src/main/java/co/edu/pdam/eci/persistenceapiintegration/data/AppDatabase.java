package co.edu.pdam.eci.persistenceapiintegration.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import co.edu.pdam.eci.persistenceapiintegration.data.dao.TeamDao;
import co.edu.pdam.eci.persistenceapiintegration.data.entity.Team;

/**
 * Created by 2092815 on 11/7/18.
 */

@Database(entities = {Team.class}, version=1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TeamDao teamDao();
}
