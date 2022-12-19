package com.example.mobiledevfinal

object StudentData {
    fun getStudents() = listOf<Student>(
        Student(1, "Akim Zholdoshbek", "Computer Science", "male"),
        Student(2, "Aidai Mamutova", "Management", "female"),
        Student(3, "Aidar Chakiev", "International Relations", "male"),
        Student(4, "Altynai Sydykova", "Psychology", "female"),
        Student(5, "Bekzhan Akzholov", "Mathematics", "male"),
    )
}
