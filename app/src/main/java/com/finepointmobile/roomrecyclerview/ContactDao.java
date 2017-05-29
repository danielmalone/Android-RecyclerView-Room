package com.finepointmobile.roomrecyclerview;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by danielmalone on 5/28/17.
 */

@Dao
public interface ContactDao {
    @Query("SELECT * FROM contact")
    List<Contact> getAll();
}
