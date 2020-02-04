<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container register-label mb-3">
		<h3>Please fill in with your details.</h3>
	</div>
	<div class="container">
		<form class="needs-validation form-design" action="webapi/usersRegistration/addUsers" method="post">
			<div class="form-row">
				<div class="col-md-6 mb-3">
					<label for="validationCustom01">First name</label> <input
						type="text" class="form-control" id="validationCustom01"
						name="fname" placeholder="First name" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-6 mb-3">
					<label for="validationCustom02">Last name</label> <input
						type="text" class="form-control" id="validationCustom02"
						name="lname" placeholder="Last name" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
			</div>


			<div class="form-row">
				<div class="col-md-4 mb-3">
					<label for="validationCustomUsername">Username</label>
					<div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" id="inputGroupPrepend">@</span>
						</div>
						<input type="text" class="form-control"
							id="validationCustomUsername" name="uname" placeholder="Username"
							aria-describedby="inputGroupPrepend" required>
						<div class="invalid-feedback">Please choose a username.</div>
					</div>
				</div>

				<div class="col-md-4 mb-3">
					<label for="exampleInputPassword1">Password</label>
					<div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" id="inputGroupPrepend"><i
								class="material-icons"> lock </i></span>
						</div>
						<input type="password" class="form-control"
							id="exampleInputPassword1" name="password" placeholder="Password"
							aria-describedby="inputGroupPrepend" required>
						<div class="invalid-feedback" id="passwordErrorSection">Please choose a Password.</div>
					</div>
				</div>

				<div class="col-md-4 mb-3">
					<label for="exampleInputPassword2">Password</label>
					<div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" id="inputGroupPrepend"><i
								class="material-icons"> lock </i></span>
						</div>
						<input type="password" class="form-control"
							id="exampleInputPassword2" name="confirm-password"
							placeholder="Confirm Password"
							aria-describedby="inputGroupPrepend" required>
						<div class="invalid-feedback">Please choose a Password.</div>
					</div>
				</div>
			</div>

			<div class="form-row">
				<label for="exampleFormControlInput1">Email address</label>
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" id="inputGroupPrepend"><i
							class="material-icons"> mail </i></span>
					</div>
					<input type="email" class="form-control" name="mail"
						id="exampleFormControlInput1" placeholder="name@example.com">
				</div>
			</div>

			<div class="form-row">
				<div class="col-md-3 mb-2">
					<label for="validationCustom03">City</label> <input type="text"
						class="form-control" id="validationCustom03" name="city_name"
						placeholder="City" required>
					<div class="invalid-feedback">Please provide a valid city.</div>
				</div>
				<div class="col-md-6 mb-3">
					<label for="validationCustom04">State</label> <input type="text"
						class="form-control" id="validationCustom04" name="state_name"
						placeholder="State" required>
					<div class="invalid-feedback">Please provide a valid state.</div>
				</div>
				<div class="col-md-3 mb-3">
					<label for="validationCustom05">Zip</label> <input type="text"
						class="form-control" id="validationCustom05" name="pincode"
						placeholder="Zip" required>
					<div class="invalid-feedback">Please provide a valid zip.</div>
				</div>
			</div>

			<div class="form-group">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value=""
						id="invalidCheck" required> <label
						class="form-check-label" for="invalidCheck"> Agree to
						terms and conditions </label>
					<div class="invalid-feedback">You must agree before
						submitting.</div>
				</div>
			</div>
			<button class="btn btn-primary" id="submitBtn" type="submit">Submit
				form</button>
		</form>
	</div>
	<script>
		// Example starter JavaScript for disabling form submissions if there are invalid fields
		(function() {
			'use strict';
			window.addEventListener('load',
					function() {
						// Fetch all the forms we want to apply custom Bootstrap validation styles to
						var forms = document
								.getElementsByClassName('needs-validation');
						// Loop over them and prevent submission
						var validation = Array.prototype.filter.call(forms,
								function(form) {
									form.addEventListener('submit', function(
											event) {
										if (form.checkValidity() === false) {
											event.preventDefault();
											event.stopPropagation();
										}
										form.classList.add('was-validated');
									}, false);
								});
					}, false);
		})();
	</script>
	<script type="text/javascript" src="js/script.js"></script>
</body>
</html>