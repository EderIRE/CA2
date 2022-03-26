package com.ie.dorset.student_id_23761.ca2


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapter: RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    private var title = arrayOf("THE PHANTOM OF THE OPEN ", "THE BATMAN", "SONIC THE HEDGEHOG 2", "MORBIUS" )

    private var details = arrayOf("The extraordinary story of an ordinary man, 'The Phantom Of The Open' is an uplifting and moving comedy drama about pursuing your dreams and shooting for the stars, no matter what hand you're dealt.", "From Warner Bros. Pictures comes \"The Batman,\" with director Matt Reeves (the \"Planet of the Apes\" films) at the helm and with Robert Pattinson (\"Tenet,\" \"The Lighthouse,\" \"Good Time\") starring as Gotham City's vigilante detective, Batman.","After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a new partner, Knuckles, in search for an emerald that has the power to destroy civilizations.", "One of Marvel's most compelling and conflicted characters comes to the big screen as Oscar winner Jared Leto transforms into the enigmatic antihero, Michael Morbius")

    private val images = intArrayOf(R.drawable.phantom, R.drawable.the_batman, R.drawable.sonic, R.drawable.morbius)

    private val imageParental = intArrayOf(R.drawable.parental, R.drawable.parental_two, R.drawable.parental_three, R.drawable.parental_four)

    private val starring = arrayOf("Sally Hawkins, Rhys Ifans, Mark Rylance", "Robert Pattinson, Zoe Kravitz, Paul Dano, Colin Farrell", "James Marsden,Ben Schwartz", "Matt Smith, Adria Arjona, Jared Leto")

    private val running = arrayOf("1hr 46mins", "2hrs 55mins", "2hrs 2mins", "1hr 48mins")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleAdapter.ViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
       return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecycleAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemDetail.text = details[position]
        holder.starring.text = starring[position]
        holder.running.text = running[position]
        holder.itemImage.setImageResource(images[position])
        holder.imageParental.setImageResource(imageParental[position])


    }

    override fun getItemCount(): Int {
        return  title.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var imageParental: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var starring: TextView
        var running: TextView


        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            imageParental = itemView.findViewById(R.id.item_parental_control)
            starring = itemView.findViewById(R.id.item_starring)
            running = itemView.findViewById(R.id.item_run_time)

            itemView.setOnClickListener {
                val position: Int = adapterPosition

                Toast.makeText(itemView.context, "${title[position]}", Toast.LENGTH_LONG).show()
            }
        }
    }


}