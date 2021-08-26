package my.edu.tarc.roomdbdemo.data

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity (tableName = "product_table")
data class Product(
    @PrimaryKey (autoGenerate = true)
    val ID: Int,

    @ColumnInfo
    val name: String,

    @ColumnInfo
    val price: Double
)
