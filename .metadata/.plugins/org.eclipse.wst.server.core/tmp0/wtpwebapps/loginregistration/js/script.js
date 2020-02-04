$(document).ready(function() {

//                $("#submitBtn").click(function(event) {
//                    event.preventDefault();

//        $.ajax({
//            type: "POST",
//            url:  "http://localhost:8080/loginregistration/webapi/usersRegistration/addUsers",
//            data: formToJSON(),
//            contentType: "application/json; charset=utf-8",
//            dataType: "json",
//            success: function(data) 
//            {
//                alert("Successfully Inserted");
//            },
//            error: function(jqXHR, textStatus, errorThrown) 
//            {
//                alert('Error: ' + textStatus);
//            }
//        });
//    });
//                
             // Enable Disable Submit BUttons
            	//*********************************
            	$('.form-group input').on('keyup', function() {
            		let empty = false;

            		$('.form-group input').each(function() {
            			if ($(this).val().length == 0) {
            				empty = true;
            			}
            		});

            		if (empty)
            			$('.actions input').attr('disabled', 'disabled');

            		else
            			$('.actions input').attr('disabled', false);
            	});
            	
            	/*Password Check*/
            	$('#exampleInputPassword1, #exampleInputPassword2').on('keyup', function () {
            		if ($('#exampleInputPassword1').val() == $('#exampleInputPassword2').val()) {
            			$('#passwordErrorSection').html('Matching').css('color', 'green');
            		} else{
            			$('#passwordErrorSection').html('Password Mismatch').css('color', 'red');
            			$('#exampleInputPassword2').css({"box-shadow": "0 0 5px red"});
            			loading = false;
            		}

            	});
});
//
//    function formToJSON() 
//    {
//        return JSON.stringify
//        ({
//            "firstname": $('#validationCustom01').val(),
//            "lastname": $('#validationCustom02').val(),
//            "username": $('#validationCustomUsername').val(),
//            "password": $('#exampleInputPassword1').val(),
//            "email": $('#exampleFormControlInput1').val(),
//            "city": $('#validationCustom03').val(),
//            "state": $('#validationCustom04').val(),
//            "pincode": $('#validationCustom05').val()
//        });
//    };