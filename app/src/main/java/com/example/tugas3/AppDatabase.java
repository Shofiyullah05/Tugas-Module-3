package com.example.tugas3;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

public class AppDatabase {
    import android.arch.persistence.room.Database;
    import android.arch.persistence.room.RoomDatabase;

    import com.tugas3.MahasiswaDAO;
    import com.tugas3.Mahasiswa;

    /*
     * Membuat Class Database
     * Entity yang digunakan adalah Mahasiswa.class
     * Version = 1
     */
    @Database(entities = {Mahasiswa.class}, version = 1)
    public abstract class AppDatabase extends RoomDatabase {

        //Untuk mengakses Database menggunakan method abstract
        public abstract MahasiswaDAO mahasiswaDAO();
    }
}
