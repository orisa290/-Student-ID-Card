package ug.ac.ndejje.student_id_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ug.ac.ndejje.student_id_card.ui.theme.Student_ID_CardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Student_ID_CardTheme {
                IDCard()
            }
        }
    }
}

@Composable
fun  Student() {

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(230.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Box (modifier = Modifier.fillMaxSize()){
            Surface( color = Color(0xFF8B0000),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
            ) {}

            Image(
                painter = painterResource(id = R.drawable.ndejje_university_ndu_logo_png_seeklogo_550327),
                contentDescription = "university logo",
                modifier = Modifier
                    .padding(10.dp)
                    .clip(CircleShape)
                    .size(70.dp)
                    .align(Alignment.TopStart)
            )
            Image(
                painter = painterResource(id = R.drawable.uganda_flag),
                contentDescription = "country flag",
                modifier = Modifier
                    .padding(10.dp)
                    .size(60.dp)
                    .align(Alignment.TopEnd)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(450.dp)
                .clip(RoundedCornerShape(20.dp))

            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 1.dp)
                        .offset(y=75.dp)
                        .graphicsLayer(alpha = 0.05f),
                    horizontalArrangement = Arrangement.spacedBy(50.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.images),
                        contentDescription = null,
                        modifier = Modifier
                            .size(140.dp)
                            .offset(x = (-55).dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.images),
                        contentDescription = null,
                        modifier = Modifier
                            .size(140.dp)
                            .offset(x = (100).dp)
                    )
                }
            }


            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            )

            {
                Spacer(modifier = Modifier.height(15.dp))


                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "student photo",
                    modifier = Modifier
                        .size(90.dp)
                        .clip(CircleShape)
                        .border(3.dp, Color.White, CircleShape),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = stringResource(R.string.atuhaire_brenda),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Text(
                    text = stringResource(R.string.programme_bsc_computer_science),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    lineHeight = 10.sp

                )
                Text(
                    text = stringResource(R.string.registration_number_24_1_306_d_100),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    lineHeight = 10.sp
                )

                Row {

                    Text(
                        text = stringResource(R.string.date_of_issue_01_02_2026),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        lineHeight = 10.sp
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = stringResource(R.string.expiry_date_01_02_2029),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        lineHeight = 10.sp
                    )




                }
                Spacer(modifier = Modifier.height(5.dp))
                Image(
                    painter = painterResource(id = R.drawable.barcode),
                    contentDescription = "barcode",
                    modifier = Modifier
                        .height(30.dp),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.height(10.dp))

                Surface(
                    color = Color(0xFF8B0000),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(5.dp)
                )

                { }




            }


        }
    }


}





@Composable
fun IDCard() {
    Student()

}


@Preview(showBackground = true)
@Composable
fun IDCardPreview() {
    Student_ID_CardTheme {
        IDCard()
    }
}




