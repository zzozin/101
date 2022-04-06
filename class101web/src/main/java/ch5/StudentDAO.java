package ch5;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	List<Student> studentList;
	
	//테스트용
	public StudentDAO() {
		studentList = new ArrayList<>();
		studentList.add(new Student(1, "홍길동", "컴퓨터공학과"));
		studentList.add(new Student(2, "김사랑", "전자공학과"));
		studentList.add(new Student(3, "강동명", "건축학과"));
	}
	
	// 전체 데이터 조회
	public List<Student> getAll() {
		return studentList;
	}
	
	// 학번 조회
    public Student getStudent(int id) {
    	// 리스트 인덱스 시작이 0 이므로 1을 빼줘야 함.
    	return studentList.get(id-1);
    }
}
