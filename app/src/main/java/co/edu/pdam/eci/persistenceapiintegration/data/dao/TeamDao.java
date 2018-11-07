package co.edu.pdam.eci.persistenceapiintegration.data.dao;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import co.edu.pdam.eci.persistenceapiintegration.data.entity.Team;

/**
 * @author Santiago Carrillo
 */

@Dao
public interface TeamDao

{
    @Query("SELECT * FROM team")
    List<Team> getAll();

    @Insert
    void insertAll(Team... users);

    @Delete
    void delete(Team user);

}
