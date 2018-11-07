package co.edu.pdam.eci.persistenceapiintegration.data.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @author Santiago Carrillo
 */

//TODO add database annotations and proper model structure
@Entity
public class Team

{
    @PrimaryKey
    public int id;

    @ColumnInfo
    public String name;

    @ColumnInfo
    public String sName;

    @ColumnInfo
    public String urlIMG;

    public Team() {
    }

    public Team(int id, String name, String sName, String urlIMG) {
        this.id = id;
        this.name = name;
        this.sName = sName;
        this.urlIMG = urlIMG;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getUrlIMG() {
        return urlIMG;
    }

    public void setUrlIMG(String urlIMG) {
        this.urlIMG = urlIMG;
    }
}
