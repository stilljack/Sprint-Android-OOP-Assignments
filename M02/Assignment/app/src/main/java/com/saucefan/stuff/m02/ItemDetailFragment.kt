package com.saucefan.stuff.m02

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Toast

import com.saucefan.stuff.m02.model.ArrayListVehicles
import com.saucefan.stuff.m02.model.Vehicle
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.item_detail.view.*

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [ItemListActivity]
 * in two-pane mode (on tablets) or a [ItemDetailActivity]
 * on handsets.
 */
class ItemDetailFragment : Fragment() {

    /**
     * The dummy content this fragment is presenting.
     */
    private var item: Vehicle?= null

    interface Favorite {
        fun flipFavorite(item:Vehicle,context: Context) {
            // so we get here from the map, but the recycler view take the array -- and that just seems crumbly
            //my peronsal toolbox doesn't really know how to handle this well so i'm gonna settle for just handling it at all right now
fun toastPop(message:String) {
                Toast.makeText(context,"flipfavorites $message", Toast.LENGTH_SHORT).show()
            }
            for (i in 0 until ArrayListVehicles.vehicleArrayList.size) {
                if (ArrayListVehicles.vehicleArrayList[i] == item ){
                    if (item.favorite){
                        item.favorite = false
                        toastPop("$item is now unfavorited -- item.favorite value=${item.favorite}")
                        break
                    }else {
                        item.favorite = true

                        toastPop("$item is now favorited --item.favorite value=${item.favorite}")
                        break
                    }
                }

            }


        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                // Load the dummy content specified by the fragment
                // arguments. In a real-world scenario, use a Loader
                // to load content from a content provider.
             item = ArrayListVehicles.ITEM_MAP[it.getString(ARG_ITEM_ID)]
                activity?.toolbar_layout?.title = item?.id
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.item_detail, container, false)

        // Show the dummy content as text in a TextView.
        item?.let {
            rootView.item_detail.text = it.travel()
        }

        return rootView
    }

    companion object {
        /**
         * The fragment argument representing the item ID that this fragment
         * represents.
         */
        const val ARG_ITEM_ID = "item_id"
    }
}
