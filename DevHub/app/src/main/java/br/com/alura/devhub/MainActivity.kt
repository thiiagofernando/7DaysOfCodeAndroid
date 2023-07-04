package br.com.alura.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import br.com.alura.devhub.ui.theme.DevHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ExibirImagem()
                }
            }
        }
    }
}


@Composable
fun ExibirImagem(){
    Column() {
        val boxHeight = remember {
            150.dp
        }
        val imageHeight = remember{
            boxHeight
        }
        Box(
            modifier = Modifier.fillMaxWidth()
                               .background(
                                   Color(0xFF2d333b), shape =  RoundedCornerShape(
                                       bottomStart = 16.dp,
                                       bottomEnd = 16.dp
                                   )
                               ).height(boxHeight)
        ){
            AsyncImage(
                "https://avatars.githubusercontent.com/u/6673080?v=4",
                contentDescription = stringResource(R.string.foto_perfil),
                placeholder = painterResource(R.drawable.user_placeholder),
                modifier =  Modifier
                    .offset(y = imageHeight / 2)
                    .size(imageHeight)
                    .align(Alignment.BottomCenter)
                    .clip(CircleShape),
            )
        }
        Spacer(modifier = Modifier.height(imageHeight / 2))
            Column(
                Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Thiago",fontSize = 32.sp);
                Text(text = "thiiagofernando",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold);
                Text(text = "Desenvolvedor de Software",
                    Modifier
                        .padding(
                            start = 8.dp,
                            bottom = 8.dp,
                            end = 8.dp
                        )
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center);
            }
    }
}