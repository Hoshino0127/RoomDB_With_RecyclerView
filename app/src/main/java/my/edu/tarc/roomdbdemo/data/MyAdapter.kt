package my.edu.tarc.myrecyclerview.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import my.edu.tarc.roomdbdemo.R
import my.edu.tarc.roomdbdemo.data.Product
import org.w3c.dom.Text

class MyAdapter(private val productList: List<Product>): RecyclerView.Adapter<MyAdapter.myViewHolder>() {
    //Refer to the product_item
    class myViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val productName: TextView = itemView.findViewById(R.id.tvName)
        val productPrice: TextView = itemView.findViewById(R.id.tvPrice)
        val productID: TextView = itemView.findViewById(R.id.tvID)
    }

    //just like onCreate
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.product_cardview,parent,false
        )

        return myViewHolder(itemView)
    }

    //pass in the list item and bind data into the view
    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val currentProduct = productList[position]
        holder.productName.text = currentProduct.name
        holder.productID.text = currentProduct.ID.toString()
        holder.productPrice.text = String.format("%.2f",currentProduct.price)

    }

    override fun getItemCount(): Int {
        return productList.size
    }
}