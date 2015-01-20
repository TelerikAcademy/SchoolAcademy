lastStudentId = 0

class Student
	constructor: (name, grade) ->
		@_id = ++lastStudentId
		@name name
		@grade grade
	id: () ->
		@_id
	name: (newName) ->
		if newName
			@_name = newName
			@
		else
			@_name
	grade: (newGrade) ->
		if newGrade
			@_grade = newGrade
			@
		else
			@_grade
	toModel: () ->
		id: @id()
		name: @name()
		grade: @grade()

students = []

getAllStudents = (req, res) ->
	studentsModels = (student.toModel() for student in students)
	res.json
		count: students.length
		students: studentsModels

addNewStudent = (req, res) ->
	student = new Student req.body.name, Number req.body.grade
	students.push student
	res.status 201
		.json student.toModel()

removeStudent = (req, res) ->
	id = Number req.params.id
	students = (student for student in students when student.id() isnt id)
	res.status 200
		.json
			message: 'Success'

module.exports = 
	getAll: getAllStudents
	add: addNewStudent
	remove: removeStudent

