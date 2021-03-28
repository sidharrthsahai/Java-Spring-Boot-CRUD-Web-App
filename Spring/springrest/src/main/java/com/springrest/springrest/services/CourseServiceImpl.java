package com.springrest.springrest.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

//	List<Course> list;
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(20300, "Java Programming", "This course contains the basics of Java."));
//		list.add(new Course(30070, "Object Oriented Programming", "This course contains the basics of OOPs concepts in Ruby."));
//		list.add(new Course(40370, "Data Mining", "This course contains data mining techniques using Python."));
//		list.add(new Course(47750, "Machine Learning with Python", "This course contains concepts like Neural Networks and Decision Trees in Python."));
//		list.add(new Course(40610, "User Centered Design", "This course contains the basics of Human Computer Interaction and UI Designing."));
//		list.add(new Course(41110, "Cloud Computing", "This course contains the basics of Cloud concepts like Linux, Virtualization and AWS Cloud Platform."));
//		list.add(new Course(41680, "Data Science in Python", "This course contains the basics of Data Science in Python."));
//		list.add(new Course(30350, "The Digital Self", "This course contains the concepts related to one's Digital Identity on the internet."));
//		list.add(new Course(40725, "SQL and Databases", "This course contains the basics of relation databases and MySQL."));
//		list.add(new Course(47500, "Advanced Data Structures in Java", "This course contains the algorithmic concepts like Arrays, LinkedLists, Trees, Maps etc."));
	}
	
	
	@Override
	public List<Course> getCourses(){		
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(long courseId) {
		
//		Course received_course = null;
//		for(Course course : list) 
//		{
//			if(course.getId() == courseId)
//			{
//				received_course = course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//			   e.setTitle(course.getTitle());
//			   e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}


	@Override
	public void deleteCourse(long parseLong) {
//		list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}	
	
	
}
