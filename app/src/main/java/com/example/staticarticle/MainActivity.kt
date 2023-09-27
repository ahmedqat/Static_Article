package com.example.staticarticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.staticarticle.ui.theme.StaticArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StaticArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    ArticleImage(article_title = stringResource(id = R.string.article_title), first_para = stringResource(
                        id = R.string.first_para
                    ) , second_para = stringResource(id = R.string.second_para))

                }
            }
        }
    }
}

@Composable
fun ArticleText(article_title: String, first_para: String, second_para: String, modifier: Modifier = Modifier){
    Column {
        Text(
            text = article_title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)

        )
        Text(
            text = first_para,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)

        )
        Text(
            text = second_para,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)



        )
    }
}

@Composable
fun ArticleImage(article_title: String,first_para: String,second_para: String,modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        ArticleText(article_title = article_title, first_para = first_para, second_para = second_para )
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StaticArticleTheme {
            ArticleImage(article_title = stringResource(id = R.string.article_title), first_para = stringResource(
                id = R.string.first_para
            ) , second_para = stringResource(id = R.string.second_para))
    }
}