package com.example.middleexam

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun IndexPage(teachers: List<Teacher>, students: List<Student>) {
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopAppBar(title = { Text("Index Page") }) }
    ) {
        NavHost(navController, startDestination = "pageA") {
            composable("pageA") { PageA(teachers) }
            composable("pageB") { PageB(students) }
            composable("pageC") { PageC() }
        }
    }
}
