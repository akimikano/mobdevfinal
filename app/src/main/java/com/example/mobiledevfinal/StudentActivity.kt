package com.example.mobiledevfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobiledevfinal.StudentAdapter
import com.example.mobiledevfinal.StudentViewModel

class StudentActivity : AppCompatActivity() {
    lateinit var viewModel: StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

//        инициализируем адаптер и присваиваем списку
        val adapter = StudentAdapter()
        val studentsList = findViewById<RecyclerView>(R.id.students_list)
        studentsList.layoutManager = LinearLayoutManager(this)
        studentsList.adapter = adapter

//        подписываем адаптер на изменение списка
        viewModel = ViewModelProvider(this).get(StudentViewModel::class.java)
        viewModel.studentsList.observe(this, Observer {
            it?.let {
                adapter.refreshStudents(it)
            }
        })
    }
}
