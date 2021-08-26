package my.edu.tarc.roomdbdemo.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {
    //suspend fun, run at background

    //fun functionName (entityName: entity)
    @Insert
    fun insertProduct (product: Product)

    //get all products
    @Query("SELECT * FROM product_table")
    fun getAll(): List<Product>

    //get the products below the given price range
    @Query("SELECT * FROM product_table WHERE price < :priceRange")
    fun getPriceBelow(priceRange: Double): List<Product>
}