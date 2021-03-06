package com.example.shop.room

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.example.shop.model.Produk

@Dao
interface DAOKeranjang {

    @Insert(onConflict = REPLACE)
    fun insert(data: Produk)

    @Delete
    fun delete(data: Produk)

    @Update
    fun update(data: Produk): Int

    @Query("SELECT * from keranjang ORDER BY id ASC")
    fun getAll(): List<Produk>

    @Query("SELECT * FROM keranjang WHERE id = :id LIMIT 1")
    fun getNote(id: Int): Produk

    @Query("DELETE FROM keranjang")
    fun deleteAll(): Int
}
