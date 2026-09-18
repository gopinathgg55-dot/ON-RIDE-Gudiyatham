package com.gudiyatham.onride
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
class MainActivity: ComponentActivity(){ override fun onCreate(s:Bundle?){super.onCreate(s);setContent{OnRideApp()}} }
@Composable fun OnRideApp(){ var p by remember{mutableStateOf("")};var d by remember{mutableStateOf("")};var v by remember{mutableStateOf("Auto")};var b by remember{mutableStateOf(false)};MaterialTheme{Scaffold{pad->Column(Modifier.fillMaxSize().padding(pad).padding(20.dp)){Text("ON RIDE",style=MaterialTheme.typography.headlineLarge);Text("Gudiyatham",style=MaterialTheme.typography.titleMedium);Spacer(Modifier.height(20.dp));OutlinedTextField(p,{p=it},Modifier.fillMaxWidth(),label={Text("Pickup Location")});Spacer(Modifier.height(10.dp));OutlinedTextField(d,{d=it},Modifier.fillMaxWidth(),label={Text("Drop Location")});Spacer(Modifier.height(16.dp));Text("Vehicle",style=MaterialTheme.typography.titleMedium);Row(horizontalArrangement=Arrangement.spacedBy(8.dp)){listOf("Auto","Car","Taxi").forEach{FilterChip(v==it,{v=it},label={Text(it)})}};Spacer(Modifier.height(16.dp));Card(Modifier.fillMaxWidth()){Column(Modifier.padding(16.dp)){Text("Fare Estimate",style=MaterialTheme.typography.titleMedium);Text(if(p.isNotBlank()&&d.isNotBlank())"Fare will be calculated" else "Pickup & Drop உள்ளிடவும்")}};Spacer(Modifier.height(20.dp));Button({b=true},enabled=p.isNotBlank()&&d.isNotBlank(),modifier=Modifier.fillMaxWidth().height(52.dp)){Text("BOOK RIDE")};if(b){Spacer(Modifier.height(16.dp));Text("Driver தேடப்படுகிறது…")}}}}}
