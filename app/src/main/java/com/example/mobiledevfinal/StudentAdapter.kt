package com.example.mobiledevfinal

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.mobiledevfinal.Student
import org.json.JSONObject
import org.json.JSONTokener


class StudentAdapter : RecyclerView.Adapter<StudentAdapter.StudentHolder>() {
    private var students: List<Student> = ArrayList<Student>()

    class StudentHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val full_name: TextView
        val major: TextView

        init {
            full_name = itemView.findViewById(R.id.student_full_name)
            major = itemView.findViewById(R.id.student_major)
        }

        fun bind(student: Student) = with(itemView) {
            full_name.text = student.full_name
            major.text = student.major
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder {
        return StudentHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StudentHolder, position: Int) {
        return holder.bind(students[position])
    }

    override fun getItemCount(): Int = students.size

    fun refreshStudents(new_students: List<Student>) {
        this.students = new_students
        notifyDataSetChanged()
    }
}