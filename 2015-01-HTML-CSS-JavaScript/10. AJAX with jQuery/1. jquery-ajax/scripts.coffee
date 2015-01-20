resourceUrl = 'http://localhost:3000/students'
$successMessage = $('.messages .success')
$errorMessage = $('.messages .error')

addStudent = (data) ->
	$.ajax
			url: resourceUrl,
			type: 'POST',
			data: JSON.stringify data
			contentType: 'application/json'
			success: (data) ->
				$successMessage.html "#{data.name} successfully added"
				$successMessage.show()
				$successMessage.fadeOut 2000
				reloadStudents()
			error: (err) ->					
				$errorMessage.html "Error happened: #{err}"
				$errorMessage.show()
				$errorMessage.fadeOut 2000
reloadStudents = () ->
	$.ajax
		url: resourceUrl,
		type: 'GET',
		contentType: 'application/json'
		success: (data) ->
			studentsList = $ '<ul/>'
				.addClass 'students-list'
			for student in data.students
				studentsList.append (
					$ '<li />'
						.addClass 'student-item'
						.append (
							$ '<strong /> '
								.html student.name
						)
						.append (
							$ '<span />'
								.html student.grade
						)
				)
			$ '#students-container'
				.html studentsList				
			return
		error: () ->
				$errorMessage.html "Error happened: #{err}"
				$errorMessage.show()
				$errorMessage.fadeOut 2000
				return
$ () ->
	reloadStudents()

	$ '#btn-add-student'
		.on 'click', () ->
			student =
				name: $('#tb-name').val()
				grade: $('#tb-grade').val()
			addStudent student
			return
		return