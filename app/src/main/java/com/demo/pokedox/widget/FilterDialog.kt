package com.demo.pokedox.widget

import android.util.Size
import android.widget.CheckedTextView
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.demo.pokedox.R
import com.demo.pokedox.data.remote.responses.PokemonList

@Composable
fun FilterBox(
    filterName: String,
    listOfOptions: List<String>,
    expanded: Boolean
) {

    // the expanded state of the Text Field
    var mExpanded by remember { mutableStateOf(expanded) }


    var selectedIndex by remember { mutableStateOf(0) }




    Box(Modifier.padding(20.dp)) {


        Row() {
            Text(text = filterName)

            Spacer(modifier = Modifier.width(2.dp))


            val painter: Painter
            if (mExpanded)
                painter = painterResource(id = R.drawable.add_image)
            else
                painter = painterResource(id = R.drawable.close_image)


            Icon(painter = painter, contentDescription = "dropdown image",
                modifier = Modifier.clickable {
                    mExpanded = !mExpanded
                })

        }


        // Create a drop-down menu with list of cities, 
        // when clicked, set the Text Field text as the city selected
        DropdownMenu(
            expanded = mExpanded,
            onDismissRequest = { mExpanded = false },

            ) {
            listOfOptions.forEachIndexed() { index, label ->
                DropdownMenuItem(onClick = {
                    selectedIndex = index
                    mExpanded = false
                }) {


                }
            }
        }
    }
}
