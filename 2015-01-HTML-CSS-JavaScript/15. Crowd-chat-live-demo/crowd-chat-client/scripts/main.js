// <li>
//   <p class="msg-text">Reprehenderit sed temporibus saepe quos ut, delectus. Quam, adipisci tenetur!</p>
//   <span class="author">Iste, ducimus.</span>
// </li>

var url = "http://crowd-chat.herokuapp.com/posts";

window.location = 'http://telerik.com'

function sendMessage(messageText) {
	var message = {
		user: 'Test User #' + Math.random(),
		text: messageText
	};
	$.ajax({
		url: url,
		type: 'POST',
		contentType: 'application/json',
		data: JSON.stringify(message),
		success: function (data) {
			loadMessages();
		}
	});
}

function loadMessages() {
	$.ajax({
		url: url,
		type: 'GET',
		contentType: 'application/json',
		success: function (data) {
			var $messageList = $('.messages')
				.html('');

			$(data)
				.each(function (index, message) {
					var $li = $('<li />')
						.appendTo($messageList);

					$('<p />')
						.addClass('msg-text')
						.html(message.text)
						.appendTo($li);
					$('<span />')
						.addClass('author')
						.html(message.by)
						.appendTo($li);
				});
		}
	});
}

$(function () {
	loadMessages();

	$('#btn-send-message')
		.on('click', function () {
			var msgText = $('#tb-msg-text')
				.val();
			sendMessage(msgText);
		});
});