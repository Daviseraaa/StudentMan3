package vn.edu.hust.studentman

object Students {
    val list: MutableList<StudentModel> = mutableListOf(
        StudentModel("Nguyễn Văn An", "22456"),
        StudentModel("Trần Thị Bảo", "23234"),
        StudentModel("Lê Hoàng Cường", "22123"),
    )

    val adapter = StudentAdapter(list)
}
