package com.example.mobiledevfinal

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StudentViewModel: ViewModel() {
    var studentsList: MutableLiveData<List<Student>> = MutableLiveData()

    init {
        studentsList.value = StudentData.getStudents()
    }

    fun getListStudents() = studentsList
}