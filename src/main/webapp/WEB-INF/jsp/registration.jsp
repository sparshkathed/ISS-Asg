<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<link rel="stylesheet" type="text/css" href="/css/styles.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script type="text/javascript" src="/js/validation.js"></script>
<script>
	function validateRegistration() {
		// Validate username
		var username = document.getElementById("regUsername").value;
		if (username.length < 8) {
			alert("Username must be at least 8 characters long");
			return false;
		}

		// Validate password
		var password = document.getElementById("regPassword").value;
		if (password.length < 8) {
			alert("Password must be at least 8 characters long");
			return false;
		}

		// Password complexity checks
		var regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]/;
		if (!regex.test(password)) {
			alert("Password must contain at least one uppercase letter, one lowercase letter, one special symbol, and one number");
			return false;
		}

		// Validate confirm password
		var confirmPassword = document.getElementById("confirmPassword").value;
		if (confirmPassword !== password) {
			alert("Passwords do not match");
			return false;
		}

		return true; // Form is valid
	}
</script>
</head>
<body>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div align="center" id="registration-container">
					<form id="registration-form" action="RegisterUser" method="post"
						onsubmit="return validateRegistration()">
						<h2>Register</h2>
						<table>
							<tr>
								<td><label for="regUsername">Username:</label></td>
								<td><input type="text" id="regUsername" name="regUsername"
									placeholder="Enter your username" required></td>
							</tr>
							<tr>
								<td><label for="regPassword">Password:</label></td>
								<td><input type="password" id="regPassword"
									name="regPassword" placeholder="Enter your password" required></td>
							</tr>
							<tr>
								<td><label for="confirmPassword">Confirm Password:</label></td>
								<td><input type="password" id="confirmPassword"
									name="confirmPassword" placeholder="Confirm your password"
									required></td>
							</tr>
						</table>
						<div class="form-group mt-3">
							<div class="row">
								<div class="col-sm-6">
									<button type="submit" class="btn btn-success btn-block">Register</button>
								</div>
								<div class="col-sm-6">
									<button type="reset" class="btn btn-danger btn-block">Reset</button>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
