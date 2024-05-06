package com.example.middleexam

import androidx.compose.runtime.Composable

data class Teacher(
    val id: Int,
    val name: String,
    val subject: String,
    val age: Int,
    val Class:String
)

data class Student(
    val id: Int,
    val name: String,
    val subject: String,
    val age: Int,
    val Class: String
)
val teacher= listOf(
    Teacher(1,"小黄","Math",40,"10A"),
    Teacher(2,"小丽","Math",41,"10A"),
    Teacher(3,"小绿","Math",42,"10A"),
    Teacher(4,"小蓝","Math",43,"10A"),
    Teacher(5,"小红","Math",44,"10A")
)
val students = listOf(
    Student(1, "啊黄", "English", 18, "10B"),
    Student(1, "小紫", "English", 19, "10B"),
    Student(1, "小橙", "English", 20, "10B"),
    Student(1, "小粉", "English", 21, "10B"),
    Student(1, "小傻", "English", 22, "10B")

)

@Composable
fun PageA(teacher: List<Teacher>){

}

@Composable
fun PageB(students: List<Student>) {

}

@Composable
fun PageC() {

}


